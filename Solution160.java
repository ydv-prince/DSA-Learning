//160. Intersection of Two Linked Lists

class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

public class Solution160 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode pointerA = headA;
        ListNode PointerB = headB;

        while(pointerA != null){
            pointerA = (pointerA == null) ? headB : pointerA.next;
            PointerB = (PointerB == null) ? headA : PointerB.next;
        }
        return pointerA;
    }
}