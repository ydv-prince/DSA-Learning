class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int n = nums.length;

        int maxi = Integer.MIN_VALUE;
        for(int num : nums){
            maxi = Math.max(maxi, num);
        }

        int low = 1;
        int high = maxi;

        while(low <= high){
            int mid = low + (high - low) / 2;

            if(calcSum(nums, mid) <= threshold){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return low;
    }

    private int calcSum(int[] arr, int divisor){
        int total = 0;

        for(int num : arr){
            total += Math.ceil((double) num / (double) divisor);
        }
        return total;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna