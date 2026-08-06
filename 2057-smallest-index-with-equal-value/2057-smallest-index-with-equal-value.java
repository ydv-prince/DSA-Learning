class Solution {
    public int smallestEqual(int[] nums) {
        for(int i=0; i<nums.length; i++){
            if(i%10 == nums[i]){
                return i;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna