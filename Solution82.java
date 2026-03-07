//82. Remove Duplicates from Sorted List II
public class Solution82 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode curr = head;

        while(curr != null){
            if(curr.next != null && curr.next.val == curr.val){
                int duplicate = curr.val;

                while(curr != null && curr.val == duplicate){
                    curr = curr.next;
                }
                prev.next = curr;
            }
            else{
                prev = prev.next;
                curr = curr.next;
            }
        
        }
        return dummy.next;
    }

    //Main method
    public static void main(String[] args) {
        // int[] values = {1,2,3,3,4,4,5};
        int[] values = {1,1,1,2,3};

        ListNode head = LInkedLIstHelper.buildList(values);
        LInkedLIstHelper.printList(head);
        ListNode result = deleteDuplicates(head);
        LInkedLIstHelper.printList(result);
    }
}