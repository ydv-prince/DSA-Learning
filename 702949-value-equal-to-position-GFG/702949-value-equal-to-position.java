class Solution {
    public static ArrayList<Integer> valEqualToPos(int[] arr) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == i+1){
                result.add(i+1);
            }
        }
        return result;
        
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna