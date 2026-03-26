//543. Diameter of Binary Tree
public class Solution543 {
    private int maxDiameter;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDiameter = 0;
        calculateHeight(root);
        return maxDiameter;
    }
    public int calculateHeight(TreeNode node){
        if(node == null){ return 0; }

        int left = calculateHeight(node.left);
        int right = calculateHeight(node.right);

        maxDiameter = Math.max(maxDiameter, left+right);

        return 1 + Math.max(left, right);
    }
}
