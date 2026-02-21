//3. Longest Substring Without Repeating Characters
import java.util.HashMap;
import java.util.Map;
public class Solution3 {
    public static int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> count = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for(int right=0; right<s.length(); right++){
            char c = s.charAt(right);

            if(count.containsKey(c)){
                left = Math.max(left, count.get(c)+1);
            }

            count.put(c, right);
            maxLength = Math.max(maxLength, right-left+1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        // String s = "pwwkew";
        // String s = "bbbbb";

        System.out.println(lengthOfLongestSubstring(s));
    }
}
