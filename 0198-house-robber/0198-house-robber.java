class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        
        return maximumLoot(nums, n, memo);
    }

    int maximumLoot(int nums[], int n, int[] memo){
        if (n <= 0){
            return 0;
            
        }
        
        if (n == 1){
            return nums[0];
        }
        
        if(memo[n] != -1){
            return memo[n];
        }
        
        int pick = nums[n-1] + maximumLoot(nums, n-2, memo);
        int notPick = maximumLoot(nums, n-1, memo);
        
        memo[n] = Math.max(pick, notPick);
        return memo[n];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna