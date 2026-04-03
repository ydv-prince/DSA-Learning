//76. Minimum Window Substring
public class Solution76 {
    public static String minWindow(String s, String t) {
        int[] targetFreq = new int[128];
        int[] windowFreq = new int[128];
      
        for (char ch : t.toCharArray()) {
            targetFreq[ch]++;
        }
      
        int sourceLen = s.length();
        int targetLen = t.length();
      
        int minWindowStart = -1;
        int minWindowLen = sourceLen + 1;
        int validCharCount = 0;
      
        int left = 0;
        for (int right = 0; right < sourceLen; right++) {
            char rightChar = s.charAt(right);
            windowFreq[rightChar]++;
          
            if (windowFreq[rightChar] <= targetFreq[rightChar]) {
                validCharCount++;
            }
          
            while (validCharCount == targetLen) {
                if (right - left + 1 < minWindowLen) {
                    minWindowLen = right - left + 1;
                    minWindowStart = left;
                }

                char leftChar = s.charAt(left);
                if (windowFreq[leftChar] <= targetFreq[leftChar]) {
                    validCharCount--;
                }
              
                windowFreq[leftChar]--;
                left++;
            }
        }
        return minWindowStart < 0 ? "" : s.substring(minWindowStart, minWindowStart + minWindowLen);
    }

    //Main method
    public static void main(String[] args) {
        String s = "ADOBECODEBANC", t = "ABC";
        // String s = "a", t = "a";
        // String s = "a", t = "aa";

        System.out.println(minWindow(s, t));
    }
}
