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
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        st1.push(root);
        while(!st1.isEmpty()){
            root = st1.pop();
            st2.add(root);
            
            if(root.left != null){
                st1.push(root.left);
            }
            if(root.right != null){
                st1.push(root.right);
            }
        }
        
        while(!st2.isEmpty()){
            res.add(st2.pop().data);
        }
        
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna