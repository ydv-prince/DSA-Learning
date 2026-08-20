class Solution {
    public static int[] productExceptSelf(int arr[]) {
        int n = arr.length;
        int[] result = new int[n];

        int leftProduct = 1;
        for(int i=0; i<n; i++){
            result[i] = leftProduct;
            leftProduct *= arr[i];
        }

        int rightProduct = 1;
        for(int j=n-1; j>=0; j--){
            result[j] *= rightProduct;
             rightProduct *= arr[j];
        }

        return result;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna