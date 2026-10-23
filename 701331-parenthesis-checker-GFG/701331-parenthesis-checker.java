class Solution {
    public boolean isBalanced(String s) {
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
    
    private boolean MatchingPair(char openBracket, char closeBracket){
        return (openBracket == '(' && closeBracket == ')') ||
                (openBracket == '{' && closeBracket == '}') ||
                (openBracket == '[' && closeBracket == ']');
    }
    
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna