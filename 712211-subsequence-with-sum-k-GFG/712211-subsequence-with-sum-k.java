class Solution {
    public boolean checkSubsequenceSum(int[] arr, int k) {
        int n = arr.length;
        
        Boolean[][] memo = new Boolean[n][k+1];
        
        return checkSubSequence(0, 0, k, arr, memo);
    }
    
    public boolean checkSubSequence(int idx, int currSum, int target, int[] arr, Boolean[][] memo){
        if(currSum == target){
            return true;
        }
        
        if(idx == arr.length){
            return false;
        }
        
        if(currSum > target){
            return false;
        }
        
        if(memo[idx][currSum] != null){
            return memo[idx][currSum];
        }
        
        boolean pick = checkSubSequence(idx+1, currSum + arr[idx], target, arr, memo);
        boolean notPick = checkSubSequence(idx+1, currSum, target, arr, memo);
        
        memo[idx][currSum] = pick || notPick;
        return memo[idx][currSum];
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna