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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> rst = new LinkedList<List<Integer>>();
        if(root == null)  return rst;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int size = 0;
        TreeNode temp = null;

        while(queue.size() != 0){
            size = queue.size();
            List<Integer> arr = new ArrayList<Integer>(size);
            for(int i = 0; i < size; i++){
                temp = queue.poll();
                arr.add(temp.val);
                if(temp.left != null)  queue.offer(temp.left);
                if(temp.right != null)  queue.offer(temp.right);
            }
            rst.addFirst(arr);
        }

        return rst;
    }

}
