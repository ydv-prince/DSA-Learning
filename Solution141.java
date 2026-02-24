//141. Linked List Cycle
import java.util.HashSet;
import java.util.Set;
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }

public class Solution141 {
    public static boolean hasCycle(ListNode head) {
        Set<ListNode> visitedNodes = new HashSet<>();

        ListNode currentNode = head;
        while(currentNode != null){
            if(!visitedNodes.add(currentNode)){
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    // Helper to build list and optionally create cycle
    public static ListNode buildList(int[] values, int pos) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        ListNode cycleNode = null;

        if (pos == 0) cycleNode = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;

            if (i == pos) {
                cycleNode = current;
            }
        }

        // Create cycle if pos != -1
        if (pos != -1) {
            current.next = cycleNode;
        }

        return head;
    }


    //Main method
    public static void main(String[] args) {
        int[] values = {3,2,0,-4};
        int pos = 1;

        // int[] values = {1,2};
        // int pos = 0;

        // int[] values = {1};
        // int pos = -1;

        ListNode head = buildList(values, pos);
        System.out.println(hasCycle(head));
    }
}
