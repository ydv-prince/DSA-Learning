//235. Lowest Common Ancestor of a Binary Search Tree
public class Solution235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int minValue = Math.min(p.val, q.val);
        int maxValue = Math.max(p.val, q.val);

        while(true){
            if(root.val < minValue){
                root = root.right;
            }
            else if(root.val > maxValue){
                root = root.left;
            }
            else{
                return root;
            }
        }
    }
}
