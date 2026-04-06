//95. Unique Binary Search Trees II
import java.util.ArrayList;
import java.util.List;
public class Solution95 {
    public static List<TreeNode> generateTrees(int n) {
        if(n == 0){ return new ArrayList<>(); }
        return generateSubTrees(1, n);
    }

    private static List<TreeNode> generateSubTrees(int start, int end){
        List<TreeNode> result = new ArrayList<>();

        if(start > end){
            result.add(null);
            return result;
        }

        for(int rootValue = start; rootValue <= end; rootValue++){
            List<TreeNode> leftSubTrees = generateSubTrees(start, rootValue-1);
            List<TreeNode> rightSubTrees = generateSubTrees(rootValue+1, end);

            for(TreeNode leftSubTree : leftSubTrees){
                for(TreeNode rightSubTree : rightSubTrees){
                    TreeNode root = new TreeNode(rootValue, leftSubTree, rightSubTree);
                    result.add(root);
                }
            }
        }
        return result;
    }
}
