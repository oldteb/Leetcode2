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
    public boolean hasPathSum(TreeNode root, int sum) {
        return dfs(root, 0, sum);

    }

    boolean dfs(TreeNode root, int subSum, int sum){
        if(root == null)  return false;
        subSum += root.val;
        if(root.left == null && root.right == null){
            if(sum == subSum)  return true;
            else return false;
        }

        if(dfs(root.left,subSum,sum) == true)  return true;
        if(dfs(root.right,subSum,sum) == true)  return true;

        return false;
    }
}
