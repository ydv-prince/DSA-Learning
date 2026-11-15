class Solution {
    public String multiplyStrings(String s1, String s2) {

        // Handle negative signs
        boolean negative = false;

        if (s1.charAt(0) == '-') {
            negative = !negative;
            s1 = s1.substring(1);
        }

        if (s2.charAt(0) == '-') {
            negative = !negative;
            s2 = s2.substring(1);
        }

        // Remove leading zeros
        s1 = removeLeadingZeros(s1);
        s2 = removeLeadingZeros(s2);

        // Handle zero multiplication
        if (s1.equals("0") || s2.equals("0")) {
            return "0";
        }

        int length1 = s1.length();
        int length2 = s2.length();

        int[] productArray = new int[length1 + length2];

        // Multiply individual digits
        for (int i = length1 - 1; i >= 0; i--) {
            int digit1 = s1.charAt(i) - '0';

            for (int j = length2 - 1; j >= 0; j--) {
                int digit2 = s2.charAt(j) - '0';

                productArray[i + j + 1] += digit1 * digit2;
            }
        }

        // Handle carries
        for (int i = productArray.length - 1; i > 0; i--) {
            productArray[i - 1] += productArray[i] / 10;
            productArray[i] %= 10;
        }

        // Build result
        int startIndex = productArray[0] == 0 ? 1 : 0;

        StringBuilder result = new StringBuilder();

        for (int i = startIndex; i < productArray.length; i++) {
            result.append(productArray[i]);
        }

        // Add negative sign if required
        if (negative) {
            result.insert(0, '-');
        }

        return result.toString();
    }

    private String removeLeadingZeros(String str) {
        int i = 0;

        while (i < str.length() - 1 && str.charAt(i) == '0') {
            i++;
        }

        return str.substring(i);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna