class Solution {
    public int findStepKeyIndex(int[] arr, int k, int x) {
        int i = 0;
        
        while(i < arr.length){
            if(arr[i] == x){
                return i;
            }
            
            int increment = Math.max(1, Math.abs(arr[i] - x) / k);
            i += increment;
        }
        
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna