/* Structure of Binary Tree Node
class Node {
    int data;
    Node left, right;
    Node(int d)
    {
        data = d;
        left = right = null;
    }
}*/

class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        
        Deque<Node> dq = new LinkedList<>();
        dq.addLast(root);
        
        boolean reverse = false;
        
        while(!dq.isEmpty()){
            int n = dq.size();
            
            while(n-- > 0){
                if(!reverse){
                    Node curr = dq.removeLast();
                    res.add(curr.data);
                    
                    if(curr.left != null){
                        dq.addFirst(curr.left);
                    }
                    
                    if(curr.right != null){
                        dq.addFirst(curr.right);
                    }
                }
                else{
                    Node curr = dq.removeFirst();
                    res.add(curr.data);
                    
                    if(curr.right != null){
                        dq.addLast(curr.right);
                    }
                    
                    if(curr.left != null){
                        dq.addLast(curr.left);
                    }
                }
            }
            reverse = !reverse;
        }
        
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna