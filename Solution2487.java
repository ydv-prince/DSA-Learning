//2487. Remove Nodes From Linked List

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution2487 {
    public static ListNode removeNodes(ListNode head) {
        List<Integer> values = new ArrayList<>();
        ListNode current = head;
        while (current != null) {
            values.add(current.val);
            current = current.next;
        }

        Deque<Integer> monotonicStack = new ArrayDeque<>();
        for (int value : values) {
            while (!monotonicStack.isEmpty() && monotonicStack.peekLast() < value) {
                monotonicStack.pollLast();
            }

            monotonicStack.offerLast(value);
        }

        ListNode dummyHead = new ListNode();
        ListNode currentNode = dummyHead;

        while (!monotonicStack.isEmpty()) {
            currentNode.next = new ListNode(monotonicStack.pollFirst());
            currentNode = currentNode.next;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        // int[] values = {5,2,13,3,8};
        int[] values = {1,1,1,1};

        ListNode head = LInkedLIstHelper.buildList(values);
        ListNode result = removeNodes(head);
        LInkedLIstHelper.printList(result);
    }
}
