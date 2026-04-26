//58. Length of Last Word
public class Solution58 {
    public static int lengthOfLastWord(String s) {
        int end = s.length()-1;

        while(end >= 0 && s.charAt(end) == ' '){
            end--;
        }

        int start = end;

        while(start >= 0 && s.charAt(start) != ' '){
            start--;
        }

        return end - start;
    }

    public static void main(String[] args) {
        // String s = "Hello World";
        // String s = "   fly me   to   the moon  ";
        String s = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(s));
    }
}
