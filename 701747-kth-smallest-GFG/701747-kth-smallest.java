class Solution {
    public int kthSmallest(int[] arr, int k) {
        int n = arr.length;
        return quickSelect(arr, 0, n - 1, k);
    }
    
    static int partition(int[] arr, int l, int r) {  
        int x = arr[r];  
        int i = l;
        
        for (int j = l; j <= r - 1; j++) {  

            if (arr[j] <= x) {  
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++; 
            }  
        }  

                int temp = arr[i];
                arr[i] = arr[r];
                arr[r] = temp;
                return i;  
    }  

            static int randomPartition(int[] arr, int l, int r) {  
                Random rand = new Random();
                int n = r - l + 1;  
                int pivot = rand.nextInt(n);      
                int temp = arr[l + pivot];
                arr[l + pivot] = arr[r];
                arr[r] = temp;
                return partition(arr, l, r); 
            }  

            static int quickSelect(int[] arr, int l, int r, int k) {  

                if (k > 0 && k <= r - l + 1) {  

                    int pos = randomPartition(arr, l, r);  

                    if (pos - l == k - 1){
                        return arr[pos];
                    }
                          

                    if (pos - l > k - 1){
                        return quickSelect(arr, l, pos - 1, k);  
                    }  
                        

                    return quickSelect(arr, pos + 1, r, k - (pos - l + 1));  
                }  

                return Integer.MAX_VALUE;  
            }
    
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna