/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> rightView(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        rightView(root, res, 0);
        return res;
    }
    
    private void rightView(Node curr, List<Integer> res, int currDepth){
        if(curr == null) return;
        
        if(currDepth == res.size()){
            res.add(curr.data);
        }
        
        rightView(curr.right, res, currDepth+1);
        rightView(curr.left, res, currDepth+1);
    }
}















// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna