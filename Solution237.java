//237. Delete Node in a Linked List
public class Solution237 {
    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    //Main method
    public static void main(String[] args) {

        int[] values = {4,5,1,9};
        ListNode head = LInkedLIstHelper.buildList(values);
        LInkedLIstHelper.printList(head);

        // delete node with value 1
        ListNode node = head.next.next;
        deleteNode(node);
        LInkedLIstHelper.printList(head);
    }
}
