/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    public ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null){ return res; }
        
        if(isLeaf(root)){
            res.add(root.data);
            return res;
        }
        
        res.add(root.data);
        addLeftBoundary(root, res);
        addLeaves(root, res);
        addRightBoundary(root, res);
        return res;
    }
    
    void addLeftBoundary(Node root, ArrayList<Integer> res){
        Node curr = root.left;
        while(curr != null){
            if(!isLeaf(curr)){
                res.add(curr.data);
            }
            if(curr.left != null){
                curr = curr.left;
            }
            else{
                curr = curr.right;
            }
        }
    }
    
    void addRightBoundary(Node root, ArrayList<Integer> res){
        Node curr = root.right;
        ArrayList<Integer> temp = new ArrayList<>();
        
        while(curr != null){
            if(!isLeaf(curr)){
                temp.add(curr.data);
            }
            if(curr.right != null){
                curr = curr.right;
            }
            else{
                curr = curr.left;
            }
        }
        
        for(int i=temp.size()-1; i>=0; i--){
            res.add(temp.get(i));
        }
    }
    
    void addLeaves(Node root, ArrayList<Integer> res){
        if(isLeaf(root)){
            res.add(root.data);
            return;
        }
        
        if(root.left != null){
            addLeaves(root.left, res);
        }
        if(root.right != null){
            addLeaves(root.right, res);
        }
    }
    
    boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna