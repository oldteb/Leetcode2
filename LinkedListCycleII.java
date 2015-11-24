/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null)  return head;

        ListNode fast = head;
        ListNode slow = head;

        do{
            if(fast.next == null || fast.next.next == null){
                return null;
            }

            fast = fast.next.next;
            slow = slow.next;

        }while(fast != slow);

        slow = head;
        while(fast != slow){
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }
}
