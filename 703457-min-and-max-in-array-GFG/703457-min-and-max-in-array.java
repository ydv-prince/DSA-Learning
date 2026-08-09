class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int num : arr){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        ArrayList<Integer> result = new ArrayList<>();
        result.add(min);
        result.add(max);
        
        return result;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna