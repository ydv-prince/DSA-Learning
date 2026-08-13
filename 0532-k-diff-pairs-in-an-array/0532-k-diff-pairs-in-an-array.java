class Solution {
    public int findPairs(int[] nums, int k) {
        Set<Integer> unique = new HashSet<>();
        Set<Integer> visited = new HashSet<>();

        for (int num : nums) {

            if (visited.contains(num - k)) {
                unique.add(num - k);
            }

            if (visited.contains(num + k)) {
                unique.add(num);
            }

            visited.add(num);
        }

        return unique.size();
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna