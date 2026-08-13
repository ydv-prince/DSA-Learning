
class Solution {
    public boolean findPair(int[] arr, int x) {
        int n = arr.length;
        
        Arrays.sort(arr);
        
        int j = 1;
        
        for(int i=0; i<n; i++){
            while(j < n && arr[j] - arr[i] < x){
                j++;
            }
            
            if(j < n && i != j && arr[j] - arr[i] == x){
                return true;
            }
        }
        return false;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna