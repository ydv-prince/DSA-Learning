//206. Reverse Linked List

class ListNode {
    int val;
    ListNode next;

    ListNode() {}

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution206 {
    public static ListNode reverseList(ListNode head) {
        ListNode dummyNode = new ListNode();
        ListNode current = head;

        while(current != null){
            ListNode nextNode = current.next;
            current.next = dummyNode.next;
            dummyNode.next = current;
            current = nextNode;
        }
        return dummyNode.next;
    }
}
