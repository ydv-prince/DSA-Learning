//13. Roman to Integer
import java.util.HashMap;
import java.util.Map;
public class Solution13 {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int totalSum = 0;

        String chars = "IVXLCDM";
        int[] values = {1,5,10,50,100,500,1000};

        for(int i=0; i<chars.length(); i++){
            map.put(chars.charAt(i), values[i]);
        }

        for(int i=0; i<s.length(); i++){
            int curr = map.get(s.charAt(i));

            if(i < s.length()-1 && curr < map.get(s.charAt(i+1))){
                totalSum -= curr;
            }else{
                totalSum += curr;
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {
        // String s = "III";
        // String s = "LVIII";
        String s = "MCMXCIV";

        System.out.println(romanToInt(s));
    }
}
