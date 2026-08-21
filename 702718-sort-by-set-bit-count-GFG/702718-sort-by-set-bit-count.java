class Solution {
    ArrayList<Integer> sortBySetBitCount(int[] arr) {
        int n = arr.length;

        ArrayList<ArrayList<Integer> > count = new ArrayList<>();

        for (int i = 0; i < 32; i++) {
            count.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            int setBit = countBits(arr[i]);
            count.get(setBit).add(arr[i]);
        }

        ArrayList<Integer> res = new ArrayList<Integer>();

        for (int i = 31; i >= 0; i--) {

            ArrayList<Integer> curr = count.get(i);
            for (int k = 0; k < curr.size(); k++) {
                res.add(curr.get(k));
            }
        }

        return res;
    }
    
    int countBits(int n)
    {
        int cnt = 0;
        while (n > 0) {
            cnt += (n & 1);
            n = n >> 1;
        }
        return cnt;
    }
    
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna