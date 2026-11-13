class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int idxA = a.length()-1;
        int idxB = b.length()-1;
        int carry = 0;

        while(idxA >= 0 || idxB >= 0 || carry > 0){
            int digitA = idxA >= 0 ? a.charAt(idxA) - '0' : 0;
            int digitB = idxB >= 0 ? b.charAt(idxB) - '0' : 0;

            int sum = digitA + digitB + carry;
            result.append(sum % 2);
            carry = sum / 2;

            idxA--;
            idxB--;
        }

        // Reverse the result since we built it backwards
        return result.reverse().toString();
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna