class Solution {
    public int mySqrt(int x) {
        if(x < 2){ return x; }

        int low = 1, high = x, res = 1;

        while(high >= low){
            int mid = low + (high - low) /2;

            if(mid <= x/mid){
                res = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna