/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int minDepth(TreeNode root) {
        int temp = 0;
        if(root == null)  return 0;
        if(root.left == null && root.right == null)  return 1;

        return Math.min((temp = minDepth(root.left)) == 0 ? Integer.MAX_VALUE : temp, (temp = minDepth(root.right)) == 0 ? Integer.MAX_VALUE : temp) + 1;
    }
}
