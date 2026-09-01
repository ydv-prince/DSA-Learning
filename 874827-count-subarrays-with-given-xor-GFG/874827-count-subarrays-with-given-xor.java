class Solution {
    public long subarrayXor(int arr[], int k) {
        int xor = 0;
        int count = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        
        for(int i=0; i<arr.length; i++){
            xor ^= arr[i];
            int x = xor ^ k;
            
            count += map.getOrDefault(x, 0);
            
            map.put(xor, map.getOrDefault(xor, 0) + 1);
        }
        return count;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna