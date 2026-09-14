class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int[] res = new int[2];

        for(int i=0; i<mat.length; i++){
            int ones = 0;
            
            for(int num : mat[i]){
                ones += num;
            }

            if(res[1] < ones){
                res[1] = ones;
                res[0] = i;
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna