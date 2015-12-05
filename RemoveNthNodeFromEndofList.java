/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || n < 1)  return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy;
        ListNode slow = dummy;
        int gap = 0;

        while(fast.next != null){
            if(gap++ < n){
                fast = fast.next;
            }
            else{
                fast = fast.next;
                slow = slow.next;
            }
        }
        if(gap < n){
            return head;
        }
        else{
            slow.next = slow.next.next;
        }

        return dummy.next;
    }
}
