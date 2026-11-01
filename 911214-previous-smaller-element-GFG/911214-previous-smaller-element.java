class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> pse = new ArrayList<>();
        Deque<Integer> stack = new ArrayDeque<>();
        
        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }
            
            pse.add(stack.isEmpty() ? -1 : stack.peek());
            stack.push(arr[i]);
        }
        
        return pse;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna