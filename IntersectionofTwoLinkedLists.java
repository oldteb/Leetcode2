/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null)  return null;
        int lenA = 1;
        int lenB = 1;
        ListNode temp = null;
        ListNode other = null;

        for(temp = headA; temp.next != null; temp = temp.next, lenA++);
        for(temp = headB; temp.next != null; temp = temp.next, lenB++);

        if(lenA > lenB){
            temp = headA;
            other = headB;
        }
        else{
            temp = headB;
            other = headA;
        }

        for(int i = 0; i < Math.abs(lenA - lenB); temp = temp.next, i++);

        while(temp != other){
            if(temp.next == null){
                return null;
            }
            else{
                temp = temp.next;
                other = other.next;
            }
        }

        return temp;



    }
}
