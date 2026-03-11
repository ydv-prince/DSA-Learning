//61. Rotate List
public class Solution61 {
    public static ListNode rotateRight(ListNode head, int k) {
        // Handle edge cases: empty list or single node
        if(head == null || head.next == null) return head;
        ListNode current = head;

        // Calculate the length of the linked list
        int length =0;
        while(current != null){
            length++;
            current = current.next;
        }

        // Optimize k by taking modulo with length to handle k > length cases
        k = k%length;

        // If k is 0, no rotation needed
        if(k == 0){
            return head;
        }

        // Use two pointers technique to find the rotation point
        // Move fast pointer k steps ahead
        ListNode slowPointer = head;
        ListNode fastPointer = head;
        for(int i=0; i<k; i++){
            fastPointer = fastPointer.next;
        }

        // Move both pointers until fast reaches the last node
        // Slow will point to the node before the new head
        while(fastPointer.next != null){
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next;
        }

        // Perform the rotation:
        // 1. New head is the node after slowPointer
        ListNode newHead = slowPointer.next;

        // 2. Break the link at the rotation point
        slowPointer.next = null;

        // 3. Connect the last node to the original head
        fastPointer.next = head;
        return newHead;
    }

    //Main method
    public static void main(String[] args) {
        // int[] values = {1,2,3,4,5};
        // int k = 2;

        int[] values = {0,1,2};
        int k = 4;

        ListNode head = LInkedLIstHelper.buildList(values);
        LInkedLIstHelper.printList(head);
        ListNode result = rotateRight(head, k);
        LInkedLIstHelper.printList(result);
    }
}
