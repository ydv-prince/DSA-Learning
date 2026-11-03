class Solution {
    public int sumSubMins(int[] arr) {
        int n = arr.length;
        int[] left = new int[n];
        int[] right = new int[n];
        Stack<Integer> st = new Stack<>();
        
        // Find the previous smaller element for each index.
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i])
                st.pop();

            left[i] = st.isEmpty() ? i + 1 : i - st.peek();
            st.push(i);
        }
        
        st.clear();
        
        // Find the next smaller or equal element for each index.
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] > arr[i])
                st.pop();

            right[i] = st.isEmpty() ? n - i : st.peek() - i;
            st.push(i);
        }
        
        long ans = 0;
        for(int i=0; i<n; i++){
            ans += (long) arr[i] * left[i] * right[i];
        }
        
        return (int) ans;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna