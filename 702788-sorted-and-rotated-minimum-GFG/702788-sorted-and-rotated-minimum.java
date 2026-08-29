class Solution {
    public int findMin(int[] arr) {
        int left = 0, right = arr.length-1;
        
        while(left < right){
            if(arr[left] < arr[right]){
                return arr[left];
            }
            
            int mid = left + (right - left) /2;
            
            if(arr[mid] > arr[right]){
                left = mid+1;
            }
            else{
                right = mid;
            }
        }
        return arr[left];
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna