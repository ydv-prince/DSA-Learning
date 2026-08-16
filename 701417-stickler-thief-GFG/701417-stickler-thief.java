class Solution {
    public int findMaxSum(int arr[]) {
        int n = arr.length;
        
        return maximumLoot(arr, n);
    }
    
    public int maximumLoot(int arr[], int n){
        if(n <= 0){
            return 0;
        }
        
        if(n == 1){
            return arr[0];
        }
        
        int pick = arr[n-1] + maximumLoot(arr, n-2);
        int notPick = maximumLoot(arr, n-1);
        
        return Math.max(pick, notPick);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna