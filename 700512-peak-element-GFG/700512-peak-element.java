class Solution {
    public int peakElement(int[] arr) {
        int n = arr.length;

        if(n == 1){ return 0; }

        if(arr[0] > arr[1]){ return 0; }

        if(arr[n-1] > arr[n-2]){ return n-1; }

        int left = 1, right = n-2;

        while(left <= right){
            int mid = left + (right - left) / 2;

            if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1]){
                return mid;
            }

            // Peak >> Right Half
            else if(arr[mid] > arr[mid-1]){
                left = mid+1;
            }

            //Peak >> Left Half
            else{
                right = mid-1;
            }
        }
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna