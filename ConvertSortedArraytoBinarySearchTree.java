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
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = null;
        if(nums == null || nums.length == 0)  return root;

        root = help(nums, 0, nums.length - 1);

        return root;

    }

    TreeNode help(int[] nums, int begin, int end){
        if(begin > end)  return null;
        if(begin == end){
            return new TreeNode(nums[begin]);
        }
        else{
            TreeNode root = new TreeNode(nums[(begin + end)/2]);
            root.left = help(nums, begin, (begin + end)/2 - 1);
            root.right = help(nums, (begin + end)/2 + 1, end);
            return root;
        }

    }
}
