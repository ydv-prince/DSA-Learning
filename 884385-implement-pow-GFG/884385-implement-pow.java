class Solution {
    double power(double b, int e) {
        return e >= 0 ? quickPower(b, e) : 1.0 / quickPower(b, -(long) e);
    }
    
    private double quickPower(double base, long exponent) {
        double result = 1.0;
    
        //process exponent bit by bit
        while (exponent > 0) {
            // If current bit is 1, multiply result by current base
            if ((exponent & 1) == 1) {
                result = result * base;
            }
            // Square the base for the next bit position
            base = base * base;
            // Right shift to process the next bit
            exponent >>= 1;
        }
    
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna