class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;

        int[] min = new int[n];
        min[n-1] = nums[n-1];

        for(int i=n-2; i>=0; i--){
            min[i] = Math.min(min[i+1], nums[i]);
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            max = Math.max(max, nums[i]);

            if(max - min[i] <= k){
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna