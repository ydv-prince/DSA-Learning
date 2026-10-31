class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        Arrays.fill(result, -1);

        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = n * 2 - 1; i >= 0; i--) {
            int currIdx = i % n;

            while (!stack.isEmpty() && stack.peek() <= nums[currIdx]) {
                stack.pop();
            }

            if (!stack.isEmpty() && i < n) {
                result[currIdx] = stack.peek();
            }

            stack.push(nums[currIdx]);
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna