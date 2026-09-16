class Solution {
    public ArrayList<Integer> findPeakGrid(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;

        int low = 0;
        int high = m-1;
        
        ArrayList<Integer> res = new ArrayList<>();

        while(low <= high){
            int mid = low + (high - low) /2;
            int row = maxElem(mat, n, m, mid);

            int left = mid-1 >= 0 ? mat[row][mid-1] : Integer.MIN_VALUE;
            int right = mid +1 < m ? mat[row][mid+1] : Integer.MIN_VALUE;

            if(mat[row][mid] >= left && mat[row][mid] >= right){
                res.add(row);
                res.add(mid);
                return res;
            }
            else if(mat[row][mid] < left){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        res.add(-1);
        res.add(-1);
        return res;
    }
    
    private int maxElem(int[][] mat, int n, int m, int col){
        int maxi = Integer.MIN_VALUE;
        int idx = -1;
    
        for(int i=0; i<n; i++){
            if(mat[i][col] > maxi){
                maxi = mat[i][col];
                idx = i;
            }
        }
        return idx;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna