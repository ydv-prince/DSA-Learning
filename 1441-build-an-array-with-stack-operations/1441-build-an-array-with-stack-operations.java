class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> res = new ArrayList<>();
        int currNum = 1;

        for(int tar : target){
            while(currNum < tar){
                res.add("Push");
                res.add("Pop");
                currNum++;
            }

            res.add("Push");
            currNum++;
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna