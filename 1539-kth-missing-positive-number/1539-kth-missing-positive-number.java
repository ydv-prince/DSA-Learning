class Solution {
    public int findKthPositive(int[] arr, int k) {
        int high = arr.length - 1;
        int low = 0;

        while(low <= high){
            int mid = low + (high - low) / 2;
            int missing = arr[mid] - (mid + 1);

            if(missing < k){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return low + k;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna