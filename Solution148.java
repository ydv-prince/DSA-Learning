
public class Solution148 {
    public static ListNode sortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        prev.next = null;
        ListNode firstHalf = head;
        ListNode secondHalf = slow;

        firstHalf = sortList(firstHalf);
        secondHalf = sortList(secondHalf);

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while(firstHalf != null && secondHalf != null){
            if(firstHalf.val <= secondHalf.val){
                current.next = firstHalf;
                firstHalf = firstHalf.next;
            }else{
                current.next = secondHalf;
                secondHalf = secondHalf.next;
            }
            current = current.next;
        }
        current.next = (firstHalf != null) ? firstHalf : secondHalf;
        return dummy.next;
    }

    //Main method
    public static void main(String[] args) {
        // int[] values = {4,2,1,3};
        // int[] values = {-1,5,3,4,0};
        int[] values = {};

        ListNode head = LInkedLIstHelper.buildList(values);
        LInkedLIstHelper.printList(head);
        ListNode result = sortList(head);
        LInkedLIstHelper.printList(result);
    }
}
