/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private List<int[]> nodes = new ArrayList<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        traverseTree(root,0,0);

        // Comparator: column > row > value (ascending)
        Collections.sort(nodes, (a,b) -> {
            //Compare column
            if(a[0] != b[0]){
                return Integer.compare(a[0], b[0]);
            }

            //If column is same, compare row
            if(a[1] != b[1]){
                return Integer.compare(a[1], b[1]);
            }

            //If column and row are same, compare value
            return Integer.compare(a[2], b[2]);
        });

        List<List<Integer>> res = new ArrayList<>();
        int prevCol = Integer.MIN_VALUE;

        for(int[] nodeInfo : nodes){
            int col = nodeInfo[0];
            int value = nodeInfo[2];

            // Start a new column group if column index changes
            if(prevCol != col){
                res.add(new ArrayList<>());
                prevCol = col;
            }

        res.get(res.size()-1).add(value);
        }

        return res;
    }

    private void traverseTree(TreeNode node, int row, int col){
        if(node == null){ return; }

        nodes.add(new int[] { col, row, node.val});

        //left subtree: row increases, column decreases
        traverseTree(node.left, row+1, col-1);

        //right subtree: row increases, column increases
        traverseTree(node.right, row+1, col+1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna