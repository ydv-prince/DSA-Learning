class Solution {
    int countTriplets(int sum, int arr[]) {
        int n = arr.length;
        Arrays.sort(arr);
        int ans = 0;
    
        for(int i=0; i<n-1; i++){
            
            int j = i+1, k = n-1;
            
            while(j < k){
                if(arr[i] + arr[j] + arr[k] >= sum){
                    k--;
                }
                else{
                    ans += (k-j);
                    j++;
                }
            }
        } 
        
        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna