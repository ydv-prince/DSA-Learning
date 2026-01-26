//53. Maximum Subarray
public class Solution53 {
    public static int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i=1; i<nums.length; i++){
            currSum = Math.max(currSum, 0)+ nums[i];
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        // int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        // int nums[] = {5,4,-1,7,8};
        int nums[] = {1};


        System.out.println(maxSubArray(nums));
    }
}
