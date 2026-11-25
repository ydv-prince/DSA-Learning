class Solution {
    public List<Integer> primeRange(int l, int r) {

        boolean[] isPrime = new boolean[r + 1];

        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= r; i++) {

            if (isPrime[i]) {

                for (int j = i * i; j <= r; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = Math.max(2, l); i <= r; i++) {
            if (isPrime[i]) {
                result.add(i);
            }
        }

        return result;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna