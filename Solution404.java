//404. Sum of Left Leaves
public class Solution404 {
    public static int sumOfLeftLeaves(TreeNode root) {
        if(root == null){ return 0; }

        int sum = sumOfLeftLeaves(root.right);

        if(root.left != null){
            if(root.left.left == null && root.left.right == null){
                sum += root.left.val;
            }
            else{
                sum += sumOfLeftLeaves(root.left);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] values = {3,9,20,-1,-1,15,7};
        // int[] values = {1};
        TreeNode root = BInaryTReeHElper.buildTree(values);
        BInaryTReeHElper.printTree(root);

        System.out.println(sumOfLeftLeaves(root));
    }
}
