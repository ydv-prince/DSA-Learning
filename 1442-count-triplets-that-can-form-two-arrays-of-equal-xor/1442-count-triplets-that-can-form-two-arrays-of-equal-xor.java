class Solution {
    public int countTriplets(int[] arr) {
        int n = arr.length;
        int count = 0;

        for(int i=0; i<n; i++){
            int xorSum = arr[i];

            for(int k=i+1; k<n; k++){
                xorSum ^= arr[k];

                if(xorSum == 0){
                count += k-i;
                }
            }

        }
        return count;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna