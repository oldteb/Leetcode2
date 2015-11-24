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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)  return true;
        return dfs(root.left, root.right);
    }

    boolean dfs(TreeNode left, TreeNode right){
        if(left == null && right == null)  return true;
        else if(left == null || right == null) return false;
        else{
            if(left.val == right.val){
                if(dfs(left.left,right.right) == false)  return false;
                if(dfs(left.right,right.left) == false)  return false;
            }
            else{
                return false;
            }

        }

        return true;

    }
}
