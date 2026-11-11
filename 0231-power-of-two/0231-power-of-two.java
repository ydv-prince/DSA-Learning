class Solution {
    public boolean isPowerOfTwo(int n) {
        // Check if n is positive (negative numbers and zero cannot be powers of two)
        // AND check if n has only one bit set using the bit manipulation trick
        
        return n > 0 && (n & (n - 1)) == 0;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna