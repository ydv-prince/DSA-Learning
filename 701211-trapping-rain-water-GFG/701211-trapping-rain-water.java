class Solution {
    public int maxWater(int arr[]) {
        int n = arr.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        
        leftMax[0] = arr[0];
        rightMax[n-1] = arr[n-1];
        
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(arr[i], leftMax[i-1]);
            rightMax[n-i-1] = Math.max(arr[n-i-1], rightMax[n-i]);
        }
        
        int totalWater = 0;
        for(int i=0; i<n; i++){
            totalWater += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }
        
        return totalWater;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna