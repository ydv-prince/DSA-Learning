/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = this.right = null;
    }
}*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        leftView(root, res, 0);
        return res;
    }

    private void leftView(Node curr, List<Integer> res, int currDepth){
        if(curr == null) return;

        if(currDepth == res.size()){
            res.add(curr.data);
        }

        leftView(curr.left, res, currDepth+1);
        leftView(curr.right, res, currDepth+1);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna