class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstOccurrence(nums, nums.length, target);
        if(first == -1){
            return new int[]{-1, -1};
        }
        int last = lastOccurrence(nums, nums.length, target);
        return new int[]{first, last};
                
    }
    private int firstOccurrence(int[] arr, int n, int k){
            int low = 0;
            int high = n-1;
            int first = -1;

            while(low <= high){
                int mid = (high + low) / 2;

                if(arr[mid] == k){
                    first = mid;
                    high = mid-1;
                }
                else if(arr[mid] < k){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            return first;
    }

    private int lastOccurrence(int[] arr, int n, int k){
            int low=0;
            int high=n-1;
            int last=-1;

            while(low <= high){
                int mid = (low + high) / 2;

                if(arr[mid] == k){
                    last = mid;
                    low = mid+1;
                }
                else if(arr[mid] < k){
                    low = mid+1;
                }
                else{
                    high = mid-1;
                }
            }
            return last;
        }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna