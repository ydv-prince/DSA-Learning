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
    public int widthOfBinaryTree(TreeNode root) {
        Deque<Pair<TreeNode, Integer>> queue = new ArrayDeque<>();
        queue.offer(new Pair<>(root, 1));

        int maxWidth = 0;

        while(!queue.isEmpty()){
            int currLevelWidth = queue.peekLast().getValue() - queue.peekFirst().getValue() + 1;
            maxWidth = Math.max(maxWidth, currLevelWidth);

            int size = queue.size();
            for(int i=0; i<size; i++){
                Pair<TreeNode, Integer> currPair = queue.pollFirst();
                TreeNode currNode = currPair.getKey();
                int currPosition = currPair.getValue();

                if(currNode.left != null){
                    queue.offer(new Pair<>(currNode.left, currPosition*2));
                }

                if(currNode.right != null){
                    queue.offer(new Pair<>(currNode.right, currPosition*2+1));
                }
            }
        }
        return maxWidth;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna