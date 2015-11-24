/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode temp = null;

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                temp = l1;
                l1 = l1.next;
            }
            else{
                temp = l2;
                l2 = l2.next;
            }

            tail.next = temp;
            tail = tail.next;
        }

        if(l1 != null && l2 == null){
            tail.next = l1;
        }
        else if(l1 == null && l2 != null){
            tail.next = l2;
        }

        return dummy.next;

    }
}
