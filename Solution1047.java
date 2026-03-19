//1047. Remove All Adjacent Duplicates In String
public class Solution1047 {
    public static String removeDuplicates(String s) {
        StringBuilder result = new StringBuilder();

        for(char c : s.toCharArray()){
            if(result.length() > 0 && result.charAt(result.length()-1) == c){
                result.deleteCharAt(result.length()-1);
            }
            else{
                result.append(c);
            }
        }
        return result.toString();
    }

    //Main method
    public static void main(String[] args) {
        // String s = "abbaca";
        String s = "azxxzy";

        System.out.println(removeDuplicates(s));
    }
}
