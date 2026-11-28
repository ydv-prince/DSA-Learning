class Solution {
    public ArrayList<Integer> largestSubset(int[] arr) {
        Arrays.sort(arr);

        int n = arr.length;

        ArrayList<ArrayList<Integer>> dp = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ArrayList<Integer> current = new ArrayList<>();
            current.add(arr[i]);

            for (int j = 0; j < i; j++) {
                if (arr[i] % arr[j] == 0) {
                    ArrayList<Integer> candidate = new ArrayList<>(dp.get(j));
                    candidate.add(arr[i]);

                    if (candidate.size() > current.size() ||
                        (candidate.size() == current.size() &&
                         isLexicographicallyGreater(candidate, current))) {
                        current = candidate;
                    }
                }
            }

            dp.add(current);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (ArrayList<Integer> subset : dp) {
            if (subset.size() > result.size() ||
                (subset.size() == result.size() &&
                 isLexicographicallyGreater(subset, result))) {
                result = subset;
            }
        }

        return result;
    }

    private boolean isLexicographicallyGreater(
        ArrayList<Integer> a, ArrayList<Integer> b) {

        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).equals(b.get(i))) {
                return a.get(i) > b.get(i);
            }
        }

        return false;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna