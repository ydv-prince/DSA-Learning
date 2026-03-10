//92. Reverse Linked List II
public class Solution92 {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next == null || left == right) return head;

        ListNode dummy = new ListNode(0, head);
        ListNode beforeReverse = dummy;

        for(int i=0; i < left-1; i++){
            beforeReverse = beforeReverse.next;
        }

        ListNode connBeforeReverse = beforeReverse;
        ListNode firstNodeToReverse = beforeReverse.next;

        ListNode prev = beforeReverse;
        ListNode curr = firstNodeToReverse;

        for(int i=0; i < right-left+1; i++){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        connBeforeReverse.next = prev;
        firstNodeToReverse.next = curr;

        return dummy.next;
    }

    //Main method
    public static void main(String[] args){
        int[] values = {1,2,3,4,5};
        int left = 2;
        int right = 4;

        // int[] values = {5};
        // int left = 1;
        // int right = 1;

        ListNode head = LInkedLIstHelper.buildList(values);
        LInkedLIstHelper.printList(head);
        ListNode result = reverseBetween(head, left, right);
        LInkedLIstHelper.printList(result);
    }
}