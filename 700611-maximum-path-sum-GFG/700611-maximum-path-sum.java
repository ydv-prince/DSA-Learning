/* Structure of binary tree node
class Node{
    int data;
    Node left, right;
    Node(int val){
        data = val;
        left = right = null;
    }
}*/

class Solution {
    
    int maxSum = Integer.MIN_VALUE;
    
    int findMaxSum(Node root) {
        calcMaxSum(root);
        return maxSum;
    }
    
    private int calcMaxSum(Node node){
        if(node == null){ return 0; }
    
        int left = Math.max(0, calcMaxSum(node.left));
        int right = Math.max(0, calcMaxSum(node.right));
    
        int currSum = node.data + left + right;
        maxSum = Math.max(maxSum, currSum);
    
        return node.data + Math.max(left, right);
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna