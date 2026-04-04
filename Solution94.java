//94. Binary Tree Inorder Traversal
import java.util.ArrayList;
import java.util.List;
public class Solution94 {
    private static List<Integer> result = new ArrayList<>();
    public static List<Integer> inorderTraversal(TreeNode root) {
        inorderDFS(root);
        return result;
    }

    private static void inorderDFS(TreeNode node){
        if(node == null){
            return;
        }

        inorderDFS(node.left);
        result.add(node.val);
        inorderDFS(node.right);
    }
}
