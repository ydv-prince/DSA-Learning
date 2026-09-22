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
    
    public ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null){ return res; }

        Stack<Node> st = new Stack<>();
        Node lastVisited = null;

        while(!st.isEmpty() || root != null){
            if(root != null){
                st.push(root);
                root = root.left;
            }
            else{
                Node peekNode = st.peek();
                if(peekNode.right != null && lastVisited != peekNode.right){
                    root = peekNode.right;
                }
                else{
                    res.add(peekNode.data);
                    lastVisited = st.pop();
                }
            }
        }
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna