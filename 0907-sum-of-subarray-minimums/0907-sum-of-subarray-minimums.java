class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        int[] nse = findNSE(arr);
        int[] pse = findPSE(arr);
        long total = 0;
        int mod = (int)(1e9 + 7);

        for(int i=0; i<n; i++){
            long left = i - pse[i];
            long right = nse[i] - i;

            long contribution = (left * right) % mod;
            contribution = (contribution * arr[i]) % mod;

            total = (total + contribution) % mod;
        }

        return (int)total;
    }

    private int[] findNSE(int[] arr){
        int n = arr.length;
        int[] nse = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=n-1; i>=0; i--){
            while(!stack.isEmpty() && arr[stack.peek()] > arr[i]){
                stack.pop();
            }

            nse[i] = stack.isEmpty() ? n : stack.peek();
            stack.push(i);
        }

        return nse;
    }

    private int[] findPSE(int[] arr){
        int n = arr.length;
        int[] pse = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i=0; i<n; i++){
            while(!stack.isEmpty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }

            pse[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(i);
        }

        return pse;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna