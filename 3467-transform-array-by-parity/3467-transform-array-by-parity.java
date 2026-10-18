class Solution {
    public int[] transformArray(int[] nums) {
        int count = 0;
        for(int num : nums){
            //XOR with 1 flips the bit: 0^1=1 (even), 1^1=0 (odd)
            count += (num % 2) ^ 1;
        }

        for(int i=0; i<count; i++){
            nums[i] = 0;
        }

        for(int i=count; i<nums.length; i++){
            nums[i] = 1;
        }

        return nums;
    }
}



// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna