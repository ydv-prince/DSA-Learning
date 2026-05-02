//111. Minimum Depth of Binary Tree
public class Solution111{
    public static int minDepth(TreeNode root) {
        if(root == null){ return 0; }

        if(root.left == null){
            return 1 + minDepth(root.right);
        }

        if(root.right == null){
            return 1 + minDepth(root.left);
        }

        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }

    public static void main(String[] args) {
        // int[] values = {3,9,20,-1,-1,15,7};
        int[] values = {2,-1,3,-1,4,-1,5,-1,6};

        TreeNode root = BInaryTReeHElper.buildTree(values);
        System.out.println(minDepth(root));
    }
}
