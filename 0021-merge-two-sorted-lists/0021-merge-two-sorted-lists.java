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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
        if(list2 == null) return list1;

        ListNode l1 = list1;
        ListNode l2 = list2;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            }
            else{
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            }
        }

        if(l1 != null){
             temp.next = l1;
        }
        else{
            temp.next = l2;
        }

        return dummy.next;
    }
}

// if(list1 == null) return list2;
// if(list2 == null) return list1;

// if(list1.val <= list2.val){
//     list1.next = mergeTwoLists(list1.next, list2);
//     return list1;
// }else{
//     list2.next = mergeTwoLists(list1, list2.next);
//     return list2;
// }

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna