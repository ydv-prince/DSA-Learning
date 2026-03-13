public class Solution328 {
    public static ListNode oddEvenList(ListNode head) {
        if(head == null) return null;

        ListNode oddCurr = head;
        ListNode evenCurr = head.next;
        ListNode evenHead = evenCurr;

        while(evenCurr != null && evenCurr.next != null){
            oddCurr.next = evenCurr.next;
            oddCurr = oddCurr.next;

            evenCurr.next = oddCurr.next;
            evenCurr = evenCurr.next;
        }
        oddCurr.next = evenHead;
        return head;
    }

    //Main method
    public static void main(String[] args) {
        int[] values = {1,2,3,4,5};
        // int[] values = {2,1,3,5,6,4,7};

        ListNode head = LInkedLIstHelper.buildList(values);
        LInkedLIstHelper.printList(head);
        ListNode result = oddEvenList(head);
        LInkedLIstHelper.printList(result);
    }
}
