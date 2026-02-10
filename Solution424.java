//424. Longest Repeating Character Replacement
public class Solution424 {
    public static int CharacterReplacement(String s, int k) {
        int[] frequency = new int[26];
        int left = 0;
        int maxFreq = 0;
        int n = s.length();

        for(int right=0; right<n; right++){
            int currentIndex = s.charAt(right) - 'A';
            frequency[currentIndex]++;
            maxFreq = Math.max(maxFreq, frequency[currentIndex]);

            int charToReplace = (right - left + 1) - maxFreq;
            if(charToReplace > k){
                int leftIndex = s.charAt(left) - 'A';
                frequency[leftIndex]--;
                left++;
            }
        }
        return n - left;
    }

    public static void main(String[] args) {
        // String s = "ABAB";
        // int k = 2;

        String s = "AABABBA";
        int k = 1;

        System.out.println(CharacterReplacement(s, k));
    }
}
