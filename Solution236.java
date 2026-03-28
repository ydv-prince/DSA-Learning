//236. Lowest Common Ancestor of a Binary Tree
public class Solution236 {
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || root == p || root == q){
            return root;
        }

        TreeNode leftLCA = lowestCommonAncestor(root.left, p, q);
        TreeNode rightLCA = lowestCommonAncestor(root.right, p, q);

        if(leftLCA != null && rightLCA != null){
            return root;
        }

        return leftLCA == null ? rightLCA : leftLCA;
    }
}
