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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if(root == null) return res;

        Deque<TreeNode> que = new ArrayDeque<>();
        que.offer(root);

        boolean left = true;

        while(!que.isEmpty()){
            List<Integer> currLevel = new ArrayList<>();
            int size = que.size();

            for(int i=0; i<size; i++){
                TreeNode currNode = que.poll();
                currLevel.add(currNode.val);

                if(currNode.left != null){
                    que.offer(currNode.left);
                }
                if(currNode.right != null){
                    que.offer(currNode.right);
                }
            }
            
            if(!left){
                Collections.reverse(currLevel);
            }
            res.add(currLevel);

            left = !left;
        }

        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna