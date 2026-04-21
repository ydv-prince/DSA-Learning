//222. Count Complete Tree Nodes
public class Solution222{
    public static int countNodes(TreeNode root) {
        if(root == null){ return 0; }

        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    public static void main(String[] args) {
        int[] values = {1,2,3,4,5,6};
        // int[] values = {};
        // int[] values = {1};

        BinaryTrees tree = new BinaryTrees();
        TreeNode root  = tree.buildTree(values);

        System.out.println(countNodes(root));
    }
}