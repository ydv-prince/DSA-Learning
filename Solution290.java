//290. Word Pattern
import java.util.HashMap;
public class Solution290 {
    public static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if(words.length != pattern.length()) return false;

        HashMap<Character, String> charToString = new HashMap<>();
        HashMap<String, Character> stringToChar = new HashMap<>();

        for(int i=0; i<words.length; i++){
            String word = words[i];
            char c = pattern.charAt(i);

            if(charToString.containsKey(c) && !charToString.get(c).equals(word)) return false;
            if(stringToChar.containsKey(word) && !stringToChar.get(word).equals(c)) return false;

            charToString.put(c, word);
            stringToChar.put(word, c);
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
