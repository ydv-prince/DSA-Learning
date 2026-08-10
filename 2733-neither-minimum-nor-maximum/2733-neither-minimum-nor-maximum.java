class Solution {
    public int findNonMinOrMax(int[] nums) {
        int n = nums.length;

        if(n < 3){ return -1; }

        int min = 100;
        int max = 1;

        for(int num : nums){
            min = Math.min(num, min);
            max = Math.max(num, max);
        }

        for(int num : nums){
            if(num != max && num != min){
                return num;
            }
        }
        return -1;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna