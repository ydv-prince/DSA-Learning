class Solution {
    public int subarrayRanges(int[] arr) {
        int n = arr.length;
        int[] leftMin = new int[n];
        int[] leftMax = new int[n];
        int[] rightMin = new int[n];
        int[] rightMax = new int[n];
        Stack<Integer> st = new Stack<>();
        
        // previous Smaller Element (leftMin)
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i]){
                st.pop();
            }
            
            leftMin[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }
        
        st.clear();
        
        // next Smaller Element (rightMin)
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }
            
            rightMin[i] = st.isEmpty() ? n - i : st.peek() - i;
            st.push(i);
        }

        st.clear();
        
        // previous Greater Element (leftMax)
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] < arr[i]) st.pop();
            leftMax[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }

        st.clear();
        
        // next Greater Element (rightMax)
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) st.pop();
            rightMax[i] = st.isEmpty() ? n - i : st.peek() - i;
            st.push(i);
        }
        
        // calculate total contribution
        int total = 0;
        for (int i = 0; i < n; i++) {
            int maxContri = leftMax[i] * rightMax[i] * arr[i];
            int minContri = leftMin[i] * rightMin[i] * arr[i];
            total += (maxContri - minContri);
        }

        return total;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna