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
    private int maxDiameter;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        calcHeight(root, maxDiameter);
        return maxDiameter;
    }

    private int calcHeight(TreeNode root, int diameter){
        if(root == null){ return 0; }

        int leftH = calcHeight(root.left, diameter);
        int rightH = calcHeight(root.right, diameter);

        maxDiameter = Math.max(maxDiameter, leftH + rightH);

        return 1 + Math.max(leftH, rightH);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna