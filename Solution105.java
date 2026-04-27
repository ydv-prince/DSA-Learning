//105. Construct Binary Tree from Preorder and Inorder Traversal
import java.util.HashMap;
import java.util.Map;
public class Solution105 {
    private static int[] preorderArray;
    private static Map<Integer, Integer> inorderMap = new HashMap<>();
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        int total = preorder.length;
        preorderArray = preorder;

        for(int i=0; i<total; ++i){
            inorderMap.put(inorder[i], i);
        }

        return DFS(0,0,total);
    }

    private static TreeNode DFS(int preorderStartIndex, int inorderStartIndex, int subtreeSize) {
        if (subtreeSize <= 0) {
            return null;
        }

        int rootValue = preorderArray[preorderStartIndex];
        int rootInorderIndex = inorderMap.get(rootValue);
        int leftSubtreeSize = rootInorderIndex - inorderStartIndex;

        TreeNode leftChild = DFS(preorderStartIndex + 1, inorderStartIndex, leftSubtreeSize);

        TreeNode rightChild = DFS(preorderStartIndex + 1 + leftSubtreeSize, 
                                 rootInorderIndex + 1, 
                                 subtreeSize - 1 - leftSubtreeSize);
        return new TreeNode(rootValue, leftChild, rightChild);
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        // int[] preorder = {-1};
        // int[] inorder = {-1};

        TreeNode result = buildTree(preorder, inorder);
        System.out.println(result);
    }
}
