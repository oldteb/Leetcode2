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
    public boolean isBalanced(TreeNode root) {
        return dfs(root) == -1 ? false : true;
    }

    int dfs(TreeNode root){
        if(root == null) return 0;
        int left = 0, right = 0;

        if((left = dfs(root.left)) == -1)  return -1;
        if((right = dfs(root.right)) == -1) return -1;

        if(Math.abs(left - right) > 1){
            return -1;
        }
        else{
            return Math.max(left, right) + 1;
        }

    }
}
