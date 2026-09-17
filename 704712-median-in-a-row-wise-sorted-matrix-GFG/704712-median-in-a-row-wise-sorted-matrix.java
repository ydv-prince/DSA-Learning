class Solution {
    public int median(int[][] mat) {
        int n = mat.length;
        int m = mat[0].length;
        
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            low = Math.min(low, mat[i][0]);
            high = Math.max(high, mat[i][m - 1]);
        }
        
        int req = (n*m) / 2;
        while(low <= high){
            int mid = low + (high-low) / 2;
            
            int smallerEquals = countSmaller(mat, mid);
            
            if(smallerEquals <= req){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low;
    }
    
    private int countSmaller(int[][] mat, int x){
        int count=0;
        int n = mat.length;
        int m = mat[0].length;
        
        for(int i=0; i<n; i++){
            count += upperBound(mat[i], x, m);
        }
        
        return count;
    }
    
    private int upperBound(int[] arr, int x, int n){
        int low=0;
        int high=n-1;
        int ans = n;
        
        while(low <= high){
            int mid = low + (high - low) /2;
            
            if(arr[mid] > x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna