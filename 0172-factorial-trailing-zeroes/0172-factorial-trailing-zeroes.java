class Solution {
    public int trailingZeroes(int n) {
        // Every 5th number (5, 10, 15, 20, ...) contributes at least one factor of 5
        // Every 25th number (25, 50, 75, ...) contributes an extra factor of 5 (since 25 = 5²)
        // Every 125th number contributes yet another factor of 5 (since 125 = 5³)
        // And so on...

        // Taking n = 130 as an example:
        // ⌊130/5⌋ = 26 numbers contribute their first factor of 5
        // ⌊130/25⌋ = 5 numbers contribute a second factor of 5
        // ⌊130/125⌋ = 1 number contributes a third factor of 5
        // Total factors of 5: 26 + 5 + 1 = 32

        int zeroCount = 0;
        while(n > 0){
            n /= 5;
            zeroCount += n;
        }
        return zeroCount;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna