//112. Path Sum
public class Solution112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return calcSum(root, targetSum);
    }

    private static boolean calcSum(TreeNode node, int remainingSum){
        if(node == null){ return false; }

        remainingSum -= node.val;

        if(node.left == null && node.right == null && remainingSum == 0){
            return true;
        }

        return calcSum(node.left, remainingSum) || calcSum(node.right, remainingSum);
    }
}
