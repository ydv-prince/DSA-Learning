class Solution {
    public long modify(long N) {
        String str = String.valueOf(N);
        StringBuilder result = new StringBuilder();
        
        for(int i=0; i<str.length(); i++){
            if(i==0 || str.charAt(i) != str.charAt(i-1)){
                result.append(str.charAt(i));
            }
        }
        
        return Long.parseLong(result.toString());
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna