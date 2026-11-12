class Solution {
    public boolean isUgly(int n) {
        // Ugly numbers must be positive
        if (n < 1) {
            return false;
        }

        // Remove all factors of 2
        while (n % 2 == 0) {
            n /= 2;
        }
      
        // Remove all factors of 3
        while (n % 3 == 0) {
            n /= 3;
        }
      
        // Remove all factors of 5
        while (n % 5 == 0) {
            n /= 5;
        }

        return n==1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna