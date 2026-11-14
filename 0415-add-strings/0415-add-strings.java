class Solution {
    public String addStrings(String num1, String num2) {
        int len1 = num1.length()-1;
        int len2 = num2.length()-1;
        int carry = 0;

        StringBuilder res = new StringBuilder();

        while(len1 >= 0 || len2 >= 0 || carry > 0){
            int digit1 = (len1 < 0) ? 0 : num1.charAt(len1) - '0';
            int digit2 = (len2 < 0) ? 0 : num2.charAt(len2) - '0';

            carry += digit1 + digit2;
            res.append(carry%10);
            carry /= 10;

            len1--;
            len2--;
        }

        return res.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna