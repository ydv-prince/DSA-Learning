class Solution {
    public int countPrimes(int n) {
        if(n <= 2) return 0;

        int arr[] = new int[n];
        arr[0] = 0;
        arr[1] = 0;
        for(int i=2; i<n; i++){
            arr[i] = 1;
        }

        for(int i=2; i*i < n; i++){
            if(arr[i] == 1){
                for(int j=i*i; j<n; j+=i){
                    arr[j] = 0;
                }
            }
        }

        int count = 0;
        for(int i=2; i<n; i++){
            if(arr[i] == 1){
                count++;
            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna