class Solution {
    boolean isPowerOfFour(int n) {
        return (n > 0) && ((n & (n - 1)) == 0) && (n % 3 == 1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna