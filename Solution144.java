//144. Binary Tree Preorder Traversal
import java.util.ArrayList;
import java.util.List;
public class Solution144{

    static List<Integer> result = new ArrayList<>();

    public static List<Integer> preorderTraversal(TreeNode root) {
        performPreOrderDFS(root);
        return result;
    }

    static void performPreOrderDFS(TreeNode node){
        if(node == null){ return; }

        result.add(node.val);
        performPreOrderDFS(node.left);
        performPreOrderDFS(node.right);
    }
}