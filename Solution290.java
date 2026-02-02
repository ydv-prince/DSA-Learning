//290. Word Pattern
import java.util.HashMap;
public class Solution290 {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false;

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for(int i=0; i<words.length; i++){
            String w = words[i];
            char c = pattern.charAt(i);

            if(charToWord.containsKey(c) && !charToWord.get(c).equals(w)) return false;
            if(wordToChar.containsKey(w) && !wordToChar.get(w).equals(c)) return false;

            wordToChar.put(w,c);
            charToWord.put(c,w);
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba", s = "dog cat cat dog";
        // String pattern = "abba", s = "dog cat cat fish";
        // String pattern = "aaaa", s = "dog cat cat dog";

        System.out.println(wordPattern(pattern, s));
    }
}
