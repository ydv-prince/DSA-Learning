/*
Definition for Node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;

    }
}
*/

class Solution {
    static class Pair {
        Node node;
        int hd;

        Pair(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }
    
    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> res = new ArrayList<>();
        if(root == null) return res;
        
        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();

        q.add(new Pair(root, 0));
        
        while(!q.isEmpty()){
            Pair p = q.remove();
            Node temp = p.node;
            int hd = p.hd;
            
            map.put(hd, temp.data);
            
            if(temp.left != null){
                q.add(new Pair(temp.left, hd - 1));
            }
            
            if(temp.right != null){
                q.add(new Pair(temp.right, hd + 1));
            }
        }
        
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            res.add(entry.getValue());
        }
        
        return res;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna