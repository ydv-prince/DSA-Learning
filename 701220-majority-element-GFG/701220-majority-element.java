class Solution {
    int majorityElement(int arr[]) {
        int n = arr.length;
        int candidate = -1;
        int count = 0;
        
        for(int num : arr){
            if(count == 0){
                candidate = num;
                count++;
            }
            else if(num == candidate){
                count++;
            }
            else{
                count--;
            }
        }
        
        count = 0;
        for(int num : arr){
            if(num == candidate){
                count++;
            }
            
            if(count > n/2){
                return candidate;
            }
        }
        
        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna