//145. Binary Tree Postorder Traversal
import java.util.ArrayList;
import java.util.List;

public class Solution145 {
    private static List<Integer> result = new ArrayList<>();
    public static List<Integer> postorderTraversal(TreeNode root) {
        performPostOrderDFS(root);
        return result;
    }

    private static void performPostOrderDFS(TreeNode node){
        if(node == null){ return; }

        performPostOrderDFS(node.left);
        performPostOrderDFS(node.right);
        result.add(node.val);
    }
}
