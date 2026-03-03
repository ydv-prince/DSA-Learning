//160. Intersection of Two Linked Lists
public class Solution160 {
    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null) return null;

        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while(pointerA != pointerB){
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }
        return pointerA;
    }

    //Main method
    public static void main(String[] args) {
        // Common part
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        // List A
        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        // List B
        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        LInkedLIstHelper.printList(headA);
        LInkedLIstHelper.printList(headB);

        ListNode result = getIntersectionNode(headA, headB);
        LInkedLIstHelper.printList(result);
    }
}
