//203. Remove Linked List Elements
public class Solution203 {
    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0, head);
        ListNode current = dummy;

        while(current.next != null){
            if(current.next.val == val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }

        return dummy.next;
    }

    //Main method
    public static void main(String[] args) {
        // int[] values = {1,2,3,4,5,6};
        // int val = 6;

        // int[] values = {};
        // int val = 1;

        int[] values = {7,7,7,7};
        int val = 7;

        ListNode head = LInkedLIstHelper.buildList(values);
        LInkedLIstHelper.printList(head);
        ListNode result = removeElements(head, val);
        LInkedLIstHelper.printList(result);
    }
}
