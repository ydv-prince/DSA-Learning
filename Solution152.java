//152. Maximum Product Subarray
public class Solution152{
    public static int maxProduct(int[] nums) {
        int currMax = nums[0];
        int currMin = nums[0];
        int result = nums[0];

        for(int i=1; i<nums.length; i++){
            int num = nums[i];

            if(num < 0){
                int temp = currMax;
                currMax = currMin;
                currMin = temp;
            }

            currMax = Math.max(num, currMax*num);
            currMin = Math.min(num, currMin*num);
            result = Math.max(result, currMax);
        }

        return result;
    }

    public static void main(String[] args) {
        // int[] nums = {2,3,-2,4};
        int[] nums = {-2,0,-1};

        System.out.println(maxProduct(nums));
    }
}
