//24. Swap Nodes in Pairs
public class Solution24 {
    public static ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode remainingList = swapPairs(head.next.next);
        ListNode newHead = head.next;
        newHead.next = head;
        head.next = remainingList;

        return newHead;
    }

    //Main method
    public static void main(String[] args) {
        int[] values = {1,2,3,4};
        // int[] values = {};
        // int[] values = {1};
        // int[] values = {1,2,3};

        ListNode head = LInkedLIstHelper.buildList(values);
        LInkedLIstHelper.printList(head);
        ListNode result = swapPairs(head);
        LInkedLIstHelper.printList(result);
    }
}
