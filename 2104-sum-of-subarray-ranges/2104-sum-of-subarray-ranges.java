class Solution {
    public long subArrayRanges(int[] nums) {
        int n = nums.length;
        long total = 0;

        for(int i=0; i<n-1; i++){
            int mini = nums[i];
            int maxi = nums[i];

            for(int j=i+1; j<n; j++){
                mini = Math.min(mini, nums[j]);
                maxi = Math.max(maxi, nums[j]);

                total += (maxi - mini);
            }
        }

        return total;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna