//83. Remove Duplicates from Sorted List

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Solution83 {
    public static ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while(current != null && current.next != null){
            if(current.val == current.next.val){
                current.next = current.next.next;
            }
            else{
                current = current.next;
            }
        }
        return head;
    }

    // Helper method to print list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static ListNode buildList(int[] values) {
    if (values.length == 0) return null;

    ListNode head = new ListNode(values[0]);
    ListNode current = head;

    for (int i = 1; i < values.length; i++) {
        current.next = new ListNode(values[i]);
        current = current.next;
    }

    return head;
}

    //Main method
    public static void main(String[] args) {
        // int[] values = {1,1,2};
        int[] values = {1,1,2,3,3};

        ListNode head = buildList(values);
        printList(head);
        head = deleteDuplicates(head);
        printList(head);
    }
}

