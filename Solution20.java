import java.util.ArrayDeque;
import java.util.Deque;

public class Solution20 {
    public static boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();

        for(char currChar : s.toCharArray()){
            if(currChar == '(' || currChar == '{' || currChar == '['){
                stack.push(currChar);
            }
            else if(stack.isEmpty() || !MatchingPair(stack.pop(), currChar)){
                return false;
            }
        }

        return stack.isEmpty();
    }

    //Helper matching pair method
    private static boolean MatchingPair(char openingBracket, char closingBracket){
        return  (openingBracket == '(' && closingBracket == ')') ||
                (openingBracket == '{' && closingBracket == '}') ||
                (openingBracket == '[' && closingBracket == ']');
    }

    //Main method
    public static void main(String[] args) {
        // String s = "()";
        // String s = "()[]{}";
        // String s = "(]";
        // String s = "([])";
        String s = "([)]";
        
        System.out.println(isValid(s));
    }
}