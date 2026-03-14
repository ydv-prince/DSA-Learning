//147. Insertion Sort List
public class Solution147 {
    public static ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode dummy = new ListNode(Integer.MIN_VALUE);
        dummy.next = head;

        ListNode prevNode = head;
        ListNode currNode = head.next;

        while(currNode != null){
            if(prevNode.val <= currNode.val){
                prevNode = currNode;
                currNode = currNode.next;
                continue;
            }

            ListNode insertPosition = dummy;
            while(insertPosition.next.val < currNode.val){
                insertPosition = insertPosition.next;
            }

            ListNode nextNode = currNode.next;
            prevNode.next = nextNode;

            currNode.next = insertPosition.next;
            insertPosition.next = currNode;

            currNode = nextNode;
        }
        return dummy.next;
    }

    //Main method
    public static void main(String[] args) {
        // int[] values = {4,2,1,3};
        int[] values = {-1,5,3,4,0};

        ListNode head = LInkedLIstHelper.buildList(values);
        LInkedLIstHelper.printList(head);

        ListNode result = insertionSortList(head);
        LInkedLIstHelper.printList(result);
    }
}