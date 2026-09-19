/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    private ArrayList<Integer> res = new ArrayList<>();
    public ArrayList<Integer> postOrder(Node root) {
        performPostOrderDFS(root);
        return res;
    }
    
    private void performPostOrderDFS(Node node){
        if(node == null){ return; }
        
        performPostOrderDFS(node.left);
        performPostOrderDFS(node.right);
        res.add(node.data);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna