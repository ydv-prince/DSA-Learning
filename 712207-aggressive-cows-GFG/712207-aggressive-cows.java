class Solution {
    public int aggressiveCows(int[] arr, int k) {
        Arrays.sort(arr);
        int n = arr.length;
        
        int low = 1;
        int high = arr[n-1];
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            
            if(canWePlace(arr, mid, k)){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return high;
    }
    
    private boolean canWePlace(int[] arr, int dist, int cows){
        int cntCows = 1;
        int last = arr[0];
        
        for(int num : arr){
            if(num - last >= dist){
                cntCows++;
                last = num;
            }
        }
        if(cntCows >= cows){
            return true;
        }
        
        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna