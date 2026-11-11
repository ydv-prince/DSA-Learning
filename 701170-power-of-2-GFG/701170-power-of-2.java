class Solution {
    public boolean isPowerofTwo(int n) {
        //If n is a power of 2, then its binary representation has
        // exactly one bit set to 1, and n-1 will have all bits to the
        // right of that bit set to 1. Therefore, n & (n-1) will always
        // be 0 for powers of 2.
        
        return (n > 0) && ((n & (n-1)) == 0);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna