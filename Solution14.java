//14. Longest Common Prefix
public class Solution14 {
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";

        int numberOfString = strs.length;
        for(int charIndex=0; charIndex < strs[0].length(); charIndex++){
            for(int stringIndex = 1; stringIndex < numberOfString; stringIndex++){
                if(strs[stringIndex].length() <= charIndex || strs[stringIndex].charAt(charIndex) != strs[0].charAt(charIndex)){
                    return strs[0].substring(0, charIndex);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
        // String strs[] = {"flower","flow","flight"};
        String strs[] = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }
}
