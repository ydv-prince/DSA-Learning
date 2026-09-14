class Solution {
    public int rowWithMax1s(int[][] arr) {
        int countMax = 0;
        int idx = -1;
        int m = arr[0].length;
        int n = arr.length;
        
        for(int i=0; i<n; i++){
            int ones = m - lowerBound(arr[i], m, 1);
            
            if(ones > countMax){
                countMax = ones;
                idx = i;
            }
        }
        return idx;
    }
    
    private int lowerBound(int[] arr, int n, int x){
        int low=0;
        int high=n-1;
        int ans = n;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(arr[mid] >= x){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna