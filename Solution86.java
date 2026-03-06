//86. Partition List
public class Solution86 {
    public static ListNode partition(ListNode head, int x) {
        ListNode leftDummy = new ListNode();
        ListNode rightDummy = new ListNode();

        ListNode left = leftDummy;
        ListNode right = rightDummy;

        while(head != null){
            if(head.val < x){
                left.next = head;
                left = left.next;
            }else{
                right.next = head;
                right = right.next;
            }
            head = head.next;
        }

        right.next = null;
        left.next = rightDummy.next;
        return leftDummy.next;
    }

    //Main method
    public static void main(String[] args) {
        int[] values = {1,4,3,2,5,2};
        int x = 3;

        // int[] values = {2,1};
        // int x = 2;

        ListNode head = LInkedLIstHelper.buildList(values);
        LInkedLIstHelper.printList(head);
        ListNode result = partition(head, x);
        LInkedLIstHelper.printList(result);
    }
}
