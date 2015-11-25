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
    public int kthSmallest(TreeNode root, int k) {
        if(root == null)  return 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        int ctr = 0;
        TreeNode last = null;;

        extract(root, stack);
        while(ctr < k){
            last = stack.pop();
            if(last.right != null){
                extract(last.right, stack);
            }
            ctr++;
        }

        return last.val;
    }

    void extract(TreeNode root, Stack<TreeNode> stack){
        stack.push(root);
        while(root.left != null){
            root = root.left;
            stack.push(root);
        }
    }
}
