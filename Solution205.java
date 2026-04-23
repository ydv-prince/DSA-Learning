//205. Isomorphic Strings
import java.util.HashMap;
import java.util.Map;
public class Solution205 {
    public static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();

        int len = s.length();
        for (int i = 0; i < len; i++) {
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if(map1.containsKey(charS) && map1.get(charS) != charT){
                return false;
            }

            if(map2.containsKey(charT) && map2.get(charT) != charS){
                return false;
            }

            map1.put(charS, charT);
            map2.put(charT, charS);
        }
        return true;
    }

    public static void main(String[] args) {
        // String  s = "egg", t = "add";
        // String s = "f11", t = "b23";
        String s = "paper", t = "title";

        System.out.println(isIsomorphic(s, t));
    }
}
