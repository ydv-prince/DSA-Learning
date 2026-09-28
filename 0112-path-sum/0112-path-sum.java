/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }

        targetSum -= root.val;

        return hasPathSum(root.left, targetSum) ||
               hasPathSum(root.right, targetSum);
    }
    // private boolean calcSum(TreeNode node, int remainingSum){
    //     if(node == null){ return false; }

    //     remainingSum -= node.val;

    //     if(node.left == null && node.right == null && remainingSum == 0){
    //         return true;
    //     }

    //     return calcSum(node.left, remainingSum) || calcSum(node.right, remainingSum);
    // }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna