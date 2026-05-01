//108. Convert Sorted Array to Binary Search Tree
public class Solution108 {
    private static int[] nums;
    public static TreeNode sortedArrayToBST(int[] nums) {
        this.nums = nums;
        return buildBST(0, nums.length-1);
    }

    private static TreeNode buildBST(int left, int right){
        if(left > right){ return null; }

        int middle = (left + right >> 1);

        return new TreeNode(
            nums[middle],
            buildBST(left, middle-1),
            buildBST(middle+1, right)
        );
    }

    public static void main(String[] args) {
        int[] nums = {-10,-3,0,5,9};
        // int[] nums = {1,3};

        TreeNode result = sortedArrayToBST(nums);
        System.out.println(result);
    }
}
