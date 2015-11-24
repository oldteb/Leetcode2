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
    public int maxDepth(TreeNode root) {
		if(root == null)  return 0;
		int depthL = 0, depthR = 0;

		depthL = maxDepth(root.left);
		depthR = maxDepth(root.right);

		if(depthL > depthR)
			return depthL + 1;
		else
			return depthR + 1;  
    }

}