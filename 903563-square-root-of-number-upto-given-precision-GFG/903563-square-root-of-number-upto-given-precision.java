class Solution {
    public double squareRoot(int n, int p) {
        // Find integer part using Binary Search
        int left = 0;
        int right = n;
        double ans = 0;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            long square = (long) mid * mid;

            if (square == n) {
                ans = mid;
                break;
            }

            if (square < n) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        
        // Find decimal part
        double increment = 0.1;

        for (int i = 0; i < p; i++) {

            while ((ans + increment) * (ans + increment) <= n) {
                ans += increment;
            }

            increment /= 10;
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna