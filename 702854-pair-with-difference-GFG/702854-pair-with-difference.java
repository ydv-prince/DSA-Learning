
class Solution {
    public boolean findPair(int[] arr, int x) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : arr){
            if(set.contains(num - x) || set.contains(num + x)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna