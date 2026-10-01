/* Structure of a Binary Tree
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
} */



class Solution {
    public int maxWidth(Node root) {
        if (root == null) return 0;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        int width = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            width = Math.max(width, size);

            for (int i = 0; i < size; i++) {
                Node currNode = queue.poll();

                if (currNode.left != null) {
                    queue.offer(currNode.left);
                }

                if (currNode.right != null) {
                    queue.offer(currNode.right);
                }
            }
        }

        return width;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna