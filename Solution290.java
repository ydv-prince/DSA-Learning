//290. Word Pattern
import java.util.HashMap;
public class Solution290 {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false;

        HashMap<String, Character> patternToWord = new HashMap<>();
        HashMap<Character, String> wordToPattern = new HashMap<>();

        for(int i=0; i<words.length; i++){
            char c = pattern.charAt(i);
            String w = words[i];

            if(patternToWord.containsKey(w) && !patternToWord.get(w).equals(c)) return false;
            if(wordToPattern.containsKey(c) && !wordToPattern.get(c).equals(w)) return false;

            patternToWord.put(w, c);
            wordToPattern.put(c, w);
        }
        return true;
    }

    public static void main(String[] args) {
        // String pattern = "abba", s = "dog cat cat dog";
        // String pattern = "abba", s = "dog cat cat fish";
        String pattern = "aaaa", s = "dog cat cat dog";

        System.out.println(wordPattern(pattern, s));
    }
}
