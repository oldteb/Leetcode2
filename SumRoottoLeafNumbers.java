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
    public int sumNumbers(TreeNode root) {
        if(root == null)  return 0;
        int[] info = new int[1];
        dfs(root, 0, info);
        return info[0];
    }



    void dfs(TreeNode root, int sum, int[] info){
        if(root == null)  return;
        int temp = sum*10 + root.val;
        if(root.left == null && root.right == null){
            info[0] += temp;
            return;
        }
        dfs(root.left, temp, info);
        dfs(root.right, temp, info);
    }
}
