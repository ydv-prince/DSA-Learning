class Solution {
    public boolean fourSum(int[] arr, int x) {
        int n = arr.length;
        Arrays.sort(arr);
        
        for(int i=0; i<n-3; i++){
            for(int j=i+1; j<n-2; j++){
                int left = j+1;
                int right = n-1;
                
                while(left < right){
                    int sum = arr[i] + arr[j] + arr[left] + arr[right];
                    
                    if(sum == x){
                        return true;
                    }
                    
                    if(sum < x){
                        left++;
                    }
                    else{
                        right--;
                    }
                }
            }
        }
        return false;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna