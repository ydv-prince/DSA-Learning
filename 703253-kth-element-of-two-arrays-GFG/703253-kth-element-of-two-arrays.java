class Solution {
    public int kthElement(int a[], int b[], int k) {
        int m = a.length;
        int n = b.length;
        
        int[] arr = new int[m+n];
        int i=0, j=0, d=0;
        
        while(i<m && j<n){
            if(a[i] < b[j]){
                arr[d++] = a[i++];
            }
            else{
                arr[d++] = b[j++];
            }
        }
        
        while(i<m){
            arr[d++] = a[i++];
        }
        
        while(j<n){
            arr[d++] = b[j++];
        }
        
        return arr[k-1];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna