/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}*/

class Solution {
    
    ArrayList<Integer> res = new ArrayList<>();
    
    public ArrayList<Integer> inOrder(Node root) {
        performInorderDFS(root);
        return res;
    }
    
    private void performInorderDFS(Node node){

        if(node == null){
            return;
        }

        performInorderDFS(node.left);
        res.add(node.data);
        performInorderDFS(node.right);

    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna