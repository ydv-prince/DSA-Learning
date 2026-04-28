//239. Sliding Window Maximum
public class Solution239{
    public static int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] result = new int[n-k+1];
        for(int i=0; i<=n-k; i++){
            int max = Integer.MIN_VALUE;
            for(int j=i; j<i+k; j++){
                max = Math.max(nums[j], max);
            }
            result[i] = max;
        }
        return result;
    }

    public static void main(String[] args) {
        // int[] nums = {1,3,-1,-3,5,3,6,7}; int k = 3;
        int[] nums = {1}; int k = 1;

        int[] output = maxSlidingWindow(nums, k);
        Solution350.printArr(output);
    }
}