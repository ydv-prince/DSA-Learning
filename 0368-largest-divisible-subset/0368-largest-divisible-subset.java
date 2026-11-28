class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        Arrays.sort(nums);
      
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1); // Each element forms a subset of size 1 by itself
      
        // Track the index with the maximum subset length
        int maxIndex = 0;
      
        // Build dp array using dynamic programming
        for (int i = 0; i < n; i++) {
            // Check all previous elements
            for (int j = 0; j < i; j++) {
                // If nums[i] is divisible by nums[j]
                if (nums[i] % nums[j] == 0) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            // Update the index of maximum subset length
            if (dp[maxIndex] < dp[i]) {
                maxIndex = i;
            }
        }
      
        // Reconstruct the largest divisible subset
        int maxLength = dp[maxIndex];
        List<Integer> result = new ArrayList<>();
      
        // Backtrack from maxIndex to build the result
        for (int i = maxIndex; maxLength > 0; i--) {
            // Check if current element can be part of the subset
            if (nums[maxIndex] % nums[i] == 0 && dp[i] == maxLength) {
                result.add(nums[i]);
                maxIndex = i;  // Update maxIndex for next iteration
                maxLength--;   // Decrease expected length
            }
        }
      
        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna