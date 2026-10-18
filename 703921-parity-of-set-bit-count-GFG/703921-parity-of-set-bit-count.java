class Solution {
    public String computeParity(int n) {
        //No. of bits (1s) in binary
        int count = Integer.bitCount(n);
        
        if (count % 2 == 0) {
            return "even";
        }
        
        return "odd";
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna