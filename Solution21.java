public class Solution21 {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        if(list1.val <= list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }
        else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }

    //Main method
    public static void main(String[] args) {
        int[] values1 = {};
        int[] values2 = {};

        // int[] values1 = {};
        // int[] values1 = {};

        // int[] values1 = {};
        // int[] values1 = {};

        ListNode head1 = LInkedLIstHelper.buildList(values1);
        ListNode head2 = LInkedLIstHelper.buildList(values2);

        LInkedLIstHelper.printList(head1);
        LInkedLIstHelper.printList(head2);

        LInkedLIstHelper.printList(mergeTwoLists(head1, head2));
    }
}
