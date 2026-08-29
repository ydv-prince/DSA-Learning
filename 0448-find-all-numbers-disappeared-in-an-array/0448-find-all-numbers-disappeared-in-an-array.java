class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        boolean[] isPresent = new boolean[n+1];

        for(int num : nums){
            isPresent[num] = true;
        }

        List<Integer> missings = new ArrayList<>();
        for(int i=1; i<=n; i++){
            if(!isPresent[i]){
                missings.add(i);
            }
        }
        return missings;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna