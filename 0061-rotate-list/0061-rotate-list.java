/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null || k == 0) return head;
        
        int len = 1;
        ListNode temp = head;
        while(temp.next != null){
            len++;
            temp = temp.next;
        }

        k = k % len;
        if(k == 0) return head;

        temp.next = head;

        ListNode lastNode = findNthNode(head, len-k);
        ListNode newHead = lastNode.next;
        lastNode.next = null;

        return newHead;
    }

    private ListNode findNthNode(ListNode node, int k){
        int count = 1;
        while(node != null){
            if(count == k) return node;
            count++;
            node = node.next;
        }
        return node;
    }
}


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna