class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int gcdLength = calculateGCD(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private int calculateGCD(int a, int b) {
        return b == 0 ? a : calculateGCD(b, a % b);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna