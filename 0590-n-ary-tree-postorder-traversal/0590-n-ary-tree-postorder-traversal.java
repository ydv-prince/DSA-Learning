/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

class Solution {
    private List<Integer> res = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        postOrderTraversal(root);
        return res;
    }

    private void postOrderTraversal(Node node) {
        if (node == null) { return; }
      
        //Processes Children → Root
        for (Node child : node.children) {
            postOrderTraversal(child);
        }
      
        res.add(node.val);
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna