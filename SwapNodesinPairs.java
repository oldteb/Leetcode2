/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null)  return null;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        ListNode tln = null;

        while(temp.next != null && temp.next.next != null){
            tln = temp.next.next.next;
            temp.next.next.next = temp.next;
            temp.next = temp.next.next;
            temp.next.next.next = tln;
            temp = temp.next.next;
        }

        return dummy.next;
    }
}
