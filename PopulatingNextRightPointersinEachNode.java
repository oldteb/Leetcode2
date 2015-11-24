/**
 * Definition for binary tree with next pointer.
 * public class TreeLinkNode {
 *     int val;
 *     TreeLinkNode left, right, next;
 *     TreeLinkNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void connect(TreeLinkNode root) {
        if(root == null)  return;
        TreeLinkNode tln1 = null;
        TreeLinkNode tln2 = null;
        TreeLinkNode tln3 = null;

        root.next = null;

        if(root.left == null){
            return;
        }

        connect(root.left);
        connect(root.right);

        tln1 = root.left;
        tln2 = root.right;
        tln3 = root.right;

        while(tln1 != null){
            tln1.next = tln2;
            tln3.next = null;
            tln1 = tln1.right;
            tln2 = tln2.left;
            tln3 = tln3.right;
        }

        return;

    }
}
