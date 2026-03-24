//19. Remove Nth Node From End of List
class Solution19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode();
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;
        while(n>0){
            fast = fast.next;
            n--;
        }

        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return dummy.next;
    }

    //Main method
    public static void main(String[] args) {
        int[] values = {1,2,3,4,5};
        int n = 2;

        // int[] values = {1};
        // int n = 1;

        // int[] values = {1,2};
        // int n = 1;

        ListNode head = LInkedLIstHelper.buildList(values);
        LInkedLIstHelper.printList(head);

        head = removeNthFromEnd(head, n);
        LInkedLIstHelper.printList(head);
    }
}
