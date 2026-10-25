class Solution {
    public static void reverseStack(Stack<Integer> st) {
        Stack<Integer> res = new Stack<>();
        
        while(!st.isEmpty()){
            res.push(st.pop());
        }
        
        st.addAll(res);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna