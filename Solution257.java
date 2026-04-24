//257. Binary Tree Paths
import java.util.ArrayList;
import java.util.List;
public class Solution257 {

    private static List<String> path = new ArrayList<>();
    private static List<String> currPath = new ArrayList<>();

    public static List<String> binaryTreePaths(TreeNode root) {
        DFS(root);
        return path;
    }

    private static void DFS(TreeNode node){
        if(node == null){
            return;
        }

        currPath.add(String.valueOf(node.val));

        if(node.left == null && node.right == null){
            path.add(String.join("->", currPath));
        }
        else{
            DFS(node.left);
            DFS(node.right);
        }

        currPath.remove(currPath.size()-1);
    }

    public static void main(String[] args) {
        // int[] values = {1,2,3,5};
        int[] values = {1};

        TreeNode root = BInaryTReeHElper.buildTree(values);
        BInaryTReeHElper.printTree(root);

        System.out.println(binaryTreePaths(root));
    }
}
