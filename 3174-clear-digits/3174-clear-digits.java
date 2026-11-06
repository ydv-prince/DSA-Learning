class Solution {
    public String clearDigits(String s) {
        StringBuilder st = new StringBuilder();

        for(char curr : s.toCharArray()){
            if(Character.isDigit(curr)){
                st.deleteCharAt(st.length()-1);
            }
            else{
                st.append(curr);
            }
        }
        return st.toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna