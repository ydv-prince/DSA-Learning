class Solution {
    public boolean fourSum(int[] arr, int x) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        
        for(int j=1; j<n-1; j++){
            for(int k=j+1; k<n; k++){
                int required = x - arr[j] - arr[k];
                
                if(set.contains(required)){
                    return true;
                }
            }
            
            for(int i=0; i<j; i++){
                set.add(arr[i] + arr[j]);
            }
        }
        return false;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna