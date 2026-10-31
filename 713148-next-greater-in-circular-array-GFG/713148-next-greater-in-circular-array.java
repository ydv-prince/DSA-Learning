class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        int n = arr.length;
        
        for(int i = 2 * n -1; i>=0; i--){
            while(!stack.isEmpty() && stack.peek() <= arr[i%n]){
                stack.pop();
            }
            
            if(i < n){
                res.add(stack.isEmpty() ? -1 : stack.peek());
            }
            
            stack.push(arr[i%n]);
        }
        
        Collections.reverse(res);
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna