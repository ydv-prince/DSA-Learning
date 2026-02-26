//19. Remove Nth Node From End of List
class Solution19 {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        
        ListNode fastPointer = dummy;
        ListNode slowPointer = dummy;

        while(n>0){
            fastPointer = fastPointer.next;
            n--;
        }

        while(fastPointer.next != null){
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        slowPointer.next = slowPointer.next.next;

        return dummy.next;
    }

    //Main method
    public static void main(String[] args) {
        // int[] values = {1,2,3,4,5};
        // int n = 2;

        // int[] values = {1};
        // int n = 1;

        int[] values = {1,2};
        int n = 1;

        ListNode head = LInkedLIstHelper.buildList(values);
        LInkedLIstHelper.printList(head);

        head = removeNthFromEnd(head, n);
        LInkedLIstHelper.printList(head);
    }
}