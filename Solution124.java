//124. Binary Tree Maximum Path Sum
public class Solution124 {
    int maxSum = -1001;
    public int maxPathSum(TreeNode root) {
        calcMaxSum(root);
        return maxSum;
    }
    private int calcMaxSum(TreeNode node){
        if(node == null){ return 0; }

        int leftSum = Math.max(0, calcMaxSum(node.left));
        int rightSum = Math.max(0, calcMaxSum(node.right));

        int currSum = leftSum + rightSum + node.val;

        maxSum = Math.max(currSum, maxSum);

        return Math.max(leftSum, rightSum) + node.val;
    }
}
