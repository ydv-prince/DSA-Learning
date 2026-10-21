class Solution {
    public int minimumPairRemoval(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int value : nums) {
            list.add(value);
        }

        int count = 0;

        while (!isNonDecreasing(list)) {
            int minIdx = 0;
            int minSum = list.get(0) + list.get(1);

            for (int i = 1; i < list.size() - 1; i++) {
                int currSum = list.get(i) + list.get(i + 1);
                if (minSum > currSum) {
                    minSum = currSum;
                    minIdx = i;
                }
            }

            list.set(minIdx, minSum);
            list.remove(minIdx + 1);

            count++;
        }

        return count;
    }

    private boolean isNonDecreasing(List<Integer> list) {
        for (int i = 1; i < list.size(); ++i) {
            if (list.get(i) < list.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna