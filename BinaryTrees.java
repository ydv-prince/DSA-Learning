import java.util.LinkedList;
import java.util.Queue;
public class BinaryTrees {
    static class Node{
        int data;
        Node left, right;

        Node(){}
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree{
        static int idx = -1;
        static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }

    static void preOrder(Node root){
        if(root == null){
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    static void postOrder(Node root){
        if(root == null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+ " ");
    }

    static void levelOrder(Node root){
        if(root == null){
            return;
        }

        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode == null){
                System.out.println();
                if(q.isEmpty()){
                    break;
                }else{
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if(currNode.left != null){
                    q.add(currNode.left);
                }
                if(currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }
//======================================================================================
    //Count of Nodes
    static int countOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftNodes = countOfNodes(root.left);
        int rightNodes = countOfNodes(root.right);

        return leftNodes + rightNodes + 1;
    }

    //Sum of Nodes
    static int sumOfNodes(Node root){
        if(root == null){
            return 0;
        }

        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);

        return leftSum + rightSum + root.data;
    }

    //Height of Tree
    static int heightOfTree(Node root){
        if(root == null){
            return 0;
        }

        int leftHeight = heightOfTree(root.left);
        int rightHeight = heightOfTree(root.right);

        int height = Math.max(leftHeight, rightHeight) + 1;
        return height;
    }

    //Diameter of Tree - O(N**2)
    static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int diam1 = diameter(root.left);
        int diam2 = diameter(root.right);
        int diam3 = heightOfTree(root.left) + heightOfTree(root.right) + 1;

        int result = Math.max(diam3, Math.max(diam1, diam2));
        return result;
    }

    //Diameter of Tree - O(N)
    static class TreeInfo{
        int diam;
        int height;

        TreeInfo(int ht, int diam){
            this.height = ht;
            this.diam = diam;
        }
    }

    static TreeInfo diameter2(Node root){
        if(root == null){
            return new TreeInfo(0,0);
        }

        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.height, right.height) + 1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.height + right.height + 1;

        int myDiam = Math.max(diam3, Math.max(diam1, diam2));

        TreeInfo info = new TreeInfo(myHeight, myDiam);
        return info;
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    // static boolean isSubTree(TreeNode root, TreeNode subRoot){
        
    // }

    // static boolean isIdentical(TreeNode root, TreeNode subRoot){
        
    // }

    //Main method
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.print("Root: ");
        System.out.println(root.data);

        System.out.print("Pre Order: ");
        preOrder(root);
        System.out.println();

        System.out.print("In Order: ");
        inOrder(root);
        System.out.println();

        System.out.print("Post Order: ");
        postOrder(root);
        System.out.println();

        System.out.println("Level Order: ");
        levelOrder(root);
        System.out.println();

        System.out.println("Count: "+countOfNodes(root));

        System.out.println("Sum of Nodes: "+ sumOfNodes(root));

        System.out.println("Height of Tree: "+heightOfTree(root));

        System.out.println("Diameter of Tree - O(N2): "+diameter(root));

        System.out.println("Diameter of Tree - O(N): "+diameter2(root).diam);
    }
}
