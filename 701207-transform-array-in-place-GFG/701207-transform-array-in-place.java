class Solution {
    public void arrange(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++){
            arr[i] = arr[i] + (arr[arr[i]] % n) * n;
        }
        
        for(int i=0; i<n; i++){
            arr[i] = arr[i] / n;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna