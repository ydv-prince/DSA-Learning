class Solution {
    public int numSubseq(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int MOD = 1000000007;

        int[] powerOfTwo = new int[n];
        powerOfTwo[0] = 1;

        for(int i=1; i<n; i++){
            powerOfTwo[i] = (powerOfTwo[i-1]*2) % MOD;
        }

        int left=0;
        int right=n-1;
        int count=0;

        while(left <= right){
            if(nums[left] + nums[right] <= target){
                count = (count + powerOfTwo[right-left]) % MOD;
                left++;
            }
            else{
                right--;
            }
        }
        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna