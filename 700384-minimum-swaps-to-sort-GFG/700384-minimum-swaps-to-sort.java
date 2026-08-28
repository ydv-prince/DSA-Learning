class Solution {
    public int minSwaps(int arr[]) {
        int n = arr.length;

        int[][] pairs = new int[n][2];

        for (int i = 0; i < n; i++) {
            pairs[i][0] = arr[i];
            pairs[i][1] = i;
        }

        Arrays.sort(pairs, (a, b) -> a[0] - b[0]);

        boolean[] visited = new boolean[n];
        int swaps = 0;

        for (int i = 0; i < n; i++) {

            if (visited[i] || pairs[i][1] == i) {
                continue;
            }

            int cycleSize = 0;
            int j = i;

            while (!visited[j]) {
                visited[j] = true;

                j = pairs[j][1];

                cycleSize++;
            }

            swaps += cycleSize - 1;
        }

        return swaps;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna