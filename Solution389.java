//389. Find the Difference
public class Solution389 {
    public static char findTheDifference(String s, String t) {
        int[] count = new int[26];

        for(char chr : s.toCharArray()){
            count[chr - 'a']++;
        }

        for(char chr : t.toCharArray()){
            count[chr - 'a']--;

            if(count[chr - 'a'] < 0){
                return chr;
            }
        }

        return ' ';
    }

    public static void main(String[] args) {
        // String s = "abcd", t = "abcde";
        String s = "", t = "y";
        System.out.println(findTheDifference(s, t));
    }
}
