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
    int maxSum = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        calcMaxSum(root);
        return maxSum;
    }

    private int calcMaxSum(TreeNode node){
        if(node == null){ return 0; }

        int left = Math.max(0, calcMaxSum(node.left));
        int right = Math.max(0, calcMaxSum(node.right));

        int currSum = node.val + left + right;
        maxSum = Math.max(maxSum, currSum);

        return node.val + Math.max(left, right);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna