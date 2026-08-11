class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        
        int repeating= -1;
        for(int i=0; i<n; i++){
            int val = Math.abs(arr[i]);
            
            if(arr[val-1] > 0){
                arr[val-1] = -arr[val-1];
                
            }else{
                repeating = val;
            }
        }
        
        int missing = -1;
        for(int i=0; i<n; i++){
            if(arr[i] > 0){
                missing = i+1;
                break;
            }
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(repeating);
        result.add(missing);
        
        return result;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna