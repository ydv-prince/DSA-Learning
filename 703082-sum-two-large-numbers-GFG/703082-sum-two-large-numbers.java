class Solution {
    String findSum(String s1, String s2) {
        int len1 = s1.length()-1;
        int len2 = s2.length()-1;
        int carry = 0;

        StringBuilder res = new StringBuilder();

        while(len1 >= 0 || len2 >= 0 || carry > 0){
            int digit1 = (len1 < 0) ? 0 : s1.charAt(len1) - '0';
            int digit2 = (len2 < 0) ? 0 : s2.charAt(len2) - '0';

            carry += digit1 + digit2;
            res.append(carry%10);
            carry /= 10;

            len1--;
            len2--;
        }
        
        while (res.length() > 1 && res.charAt(res.length() - 1) == '0') {
            res.deleteCharAt(res.length() - 1);
        }

        return res.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna