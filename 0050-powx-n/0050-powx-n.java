class Solution {
    public double myPow(double x, int n) {
        long power = n;

        // Handle negative powers
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double ans = 1;

        while (power > 0) {

            // If power is odd
            if (power % 2 == 1) {
                ans *= x;
            }

            // Square the base
            x *= x;

            // Divide power by 2
            power /= 2;
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna