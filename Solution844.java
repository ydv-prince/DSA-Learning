import java.util.ArrayDeque;
import java.util.Deque;

//844. Backspace String Compare
public class Solution844 {
    public static boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }

    private static String build(String s){
        Deque<Character> stack = new ArrayDeque<>();
        for(char c : s.toCharArray()){
            if(c == '#'){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }
            else{
                stack.push(c);
            }
        }

        StringBuilder result = new StringBuilder();
        while(!stack.isEmpty()){
            result.append(stack.pop());
        }

        return result.toString();
    }
    //Main method
    public static void main(String[] args) {
        // String s = "ab#c", t = "ad#c";
        String s = "ab##", t = "c#d#";
        // String s = "a#c", t = "b";

        System.out.println(backspaceCompare(s, t));
    }
}
