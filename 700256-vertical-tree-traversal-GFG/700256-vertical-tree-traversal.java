/* Structure of binary tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}*/

class Solution {
    private List<int[]> nodes = new ArrayList<>();
    private int order = 0;

    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        nodes.clear();
        order = 0;

        traverseTree(root);

        Collections.sort(nodes, (a, b) -> {

            // Column
            if (a[0] != b[0]) {
                return Integer.compare(a[0], b[0]);
            }

            // Row
            if (a[1] != b[1]) {
                return Integer.compare(a[1], b[1]);
            }

            // Level-order
            return Integer.compare(a[2], b[2]);
        });

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int prevCol = Integer.MIN_VALUE;

        for (int[] nodeInfo : nodes) {

            int col = nodeInfo[0];
            int value = nodeInfo[3];

            if (prevCol != col) {
                res.add(new ArrayList<>());
                prevCol = col;
            }

            res.get(res.size() - 1).add(value);
        }

        return res;
    }

    private void traverseTree(Node root) {

        if (root == null) {
            return;
        }

        Queue<NodeInfo> queue = new LinkedList<>();
        queue.add(new NodeInfo(root, 0, 0));

        while (!queue.isEmpty()) {

            NodeInfo current = queue.poll();

            Node node = current.node;
            int row = current.row;
            int col = current.col;

            nodes.add(new int[]{col, row, order++, node.data});

            if (node.left != null) {
                queue.add(new NodeInfo(node.left, row + 1, col - 1));
            }

            if (node.right != null) {
                queue.add(new NodeInfo(node.right, row + 1, col + 1));
            }
        }
    }

    private static class NodeInfo {
        Node node;
        int row;
        int col;

        NodeInfo(Node node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna