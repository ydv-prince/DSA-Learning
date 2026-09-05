class Solution {
    public int nthRoot(int n, int m) {
        int low = 0;
        int high = m;

        while(low <= high){
            int mid = low + (high - low) / 2;

            int midN = root(mid, n, m);

            if(midN == 1){
                return mid;
            }

            else if(midN == 0){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return -1;
    }
    
    private int root(int mid, int n, int m){
        int ans = 1;

        for(int i=1; i<=n; i++){
            ans = ans*mid;

            if(ans > m){
                return 2;
            }
        }
        if(ans == m){
            return 1;
        }

        return 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna