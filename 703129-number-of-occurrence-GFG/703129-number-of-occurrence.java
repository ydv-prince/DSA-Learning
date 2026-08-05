class Solution {
    int countFreq(int[] arr, int target) {
        int first = firstOccurrence(arr, arr.length, target);
        if(first == -1){return 0;}
        int last = lastOccurrence(arr, arr.length, target);
        return (last - first) + 1;
        
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