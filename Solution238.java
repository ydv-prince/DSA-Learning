//238. Product of Array Except Self
public class Solution238 {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int leftProduct = 1;
        for(int i=0; i<n; i++){
            result[i] = leftProduct;
            leftProduct *= nums[i];
        }

        int rightProduct = 1;
        for(int i=n-1; i>=0; i--){
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }

        return result;
    }

    //Main method
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        // int[] nums = {-1,1,0,-3,3};

        Solution350.printArr(productExceptSelf(nums));
    }
}
