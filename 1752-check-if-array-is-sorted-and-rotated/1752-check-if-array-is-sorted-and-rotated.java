class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;

        for(int i=0; i<n; i++){
            //Move to the next index, and if we reach the end of the array, go back to index 0
            int idx = (i + 1) % n;

            if(nums[i] > nums[idx]){
                count++;
            }
        }

        return count <= 1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna