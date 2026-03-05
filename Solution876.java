//876. Middle of the Linked List
public class Solution876 {
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //Main method
    public static void main(String[] args) {
        // int[] values = {1,2,3,4,5};
        int[] values = {1,2,3,4,5,6};

        ListNode head = LInkedLIstHelper.buildList(values);
        LInkedLIstHelper.printList(head);
        ListNode result = middleNode(head);
        LInkedLIstHelper.printList(result);
    }
}
