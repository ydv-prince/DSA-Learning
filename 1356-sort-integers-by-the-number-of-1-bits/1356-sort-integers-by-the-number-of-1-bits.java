class Solution {
    public int[] sortByBits(int[] arr) {

        ArrayList<ArrayList<Integer>> count = new ArrayList<>();

        for (int i = 0; i < 32; i++) {
            count.add(new ArrayList<>());
        }

        for (int num : arr) {
            int setBits = countBits(num);
            count.get(setBits).add(num);
        }

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < 32; i++) {

            ArrayList<Integer> curr = count.get(i);

            Collections.sort(curr);

            for (int num : curr) {
                res.add(num);
            }
        }

        int[] answer = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            answer[i] = res.get(i);
        }

        return answer;
    }

    int countBits(int n) {
        int cnt = 0;

        while (n > 0) {
            cnt += (n & 1);
            n >>= 1;
        }

        return cnt;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna