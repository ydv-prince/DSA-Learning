class Solution {
    public String addBinary(String s1, String s2) {
        StringBuilder res = new StringBuilder();
        
        int idxA = s1.length()-1;
        int idxB = s2.length()-1;
        int carry = 0;
        
        while(idxA>=0 || idxB>=0 || carry > 0){
            int digit1 = idxA >= 0 ? s1.charAt(idxA) - '0' : 0;
            int digit2 = idxB >= 0 ? s2.charAt(idxB) - '0' : 0;
            
            int sum = digit1 + digit2 + carry;
            
            res.append(sum%2);
            carry = sum / 2;
            
            idxA--;
            idxB--;
            
        }
        
        //To remove the leading zeros
        while (res.length() > 1 && res.charAt(res.length() - 1) == '0') {
            res.deleteCharAt(res.length() - 1);
        }
        
        return res.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna