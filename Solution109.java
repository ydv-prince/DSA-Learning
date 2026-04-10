//109. Convert Sorted List to Binary Search Tree
import java.util.ArrayList;
import java.util.List;

public class Solution109{
    private static List<Integer> list = new ArrayList<>();
    public static TreeNode sortedListToBST(ListNode head) {
        ListNode current = head;
        while(current != null){
            list.add(current.val);
            current = current.next;
        }

        return buildBST(0, list.size()-1);
    }

    private static TreeNode buildBST(int left, int right){
        if(left > right){
            return null;
        }

        int mid = left + (right - left) / 2;

        TreeNode leftSubTree = buildBST(left, mid-1);
        TreeNode rightSubTree = buildBST(mid+1, right);

        TreeNode root = new TreeNode(list.get(mid), leftSubTree, rightSubTree);

        return root;
    }
}
