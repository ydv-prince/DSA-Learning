//1721. Swapping Nodes in a Linked List
public class Solution1721 {
    public static ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;

        for(int i=1; i<k; i++){
            fast = fast.next;
        }

        ListNode firstKth = fast;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        ListNode lastKth = slow;

        int temp = firstKth.val;
        firstKth.val = lastKth.val;
        lastKth.val = temp;

        return head;
    }

    public static void main(String[] args) {
        // int[] values = {1,2,3,4,5}; int k = 2;
        int[] values = {7,9,6,6,7,8,3,0,9,5}; int k = 5;


        ListNode head = LInkedLIstHelper.buildList(values);
        ListNode result = swapNodes(head, k);

        LInkedLIstHelper.printList(result);
    }
}