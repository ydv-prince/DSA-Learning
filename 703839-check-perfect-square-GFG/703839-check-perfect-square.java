class Solution {
    public boolean isPerfectSquare(int n) {
        if(n < 2) return true;

        long low = 1;
        long high = n / 2;

        while(low <= high){
            long mid = low + (high - low) / 2;

            // Use long to prevent multiplication overflow
            long square = mid * mid;

            if(square == n){
                return true;
            }
            else if(square < n){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna