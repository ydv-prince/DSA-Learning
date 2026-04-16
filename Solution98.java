//98. Validate Binary Search Tree
public class Solution98 {
    private static TreeNode prev;
    public static boolean isValidBST(TreeNode root) {
        return inOrderTransversal(root);
    }

    private static boolean inOrderTransversal(TreeNode currentNode){
        if(currentNode == null){ return true; }

        if(!inOrderTransversal(currentNode.left)){ return false; }

        if(prev != null && prev.val >= currentNode.val){ return false; }

        prev = currentNode;

        return inOrderTransversal(currentNode.right);
    }
}
