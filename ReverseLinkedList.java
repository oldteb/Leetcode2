/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode head1 = head;
        ListNode head2 = null;
        ListNode temp = null;

        while(head1 != null){
            temp = head1;
            head1 = head1.next;
            temp.next = head2;
            head2 = temp;
        }

        return head2;

    }
}
