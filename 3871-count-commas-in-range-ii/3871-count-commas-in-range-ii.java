class Solution {
    public long countCommas(long n) {
        long total = 0;

        for(long threshold=1000; threshold <= n; threshold *= 1000){
            total += n - threshold + 1;
        }
        return total;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna