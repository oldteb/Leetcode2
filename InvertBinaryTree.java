/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/**
 *  DFS
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
    	TreeNode tn;
    	if(root != null){
	    	tn = root.left;
	    	root.left = root.right;
	    	root.right = tn;
	    	invertTree(root.left);
	    	invertTree(root.right);
    	}

    	return root;
    }
}



/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

/**
 *  BFS
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null)  return null;
        int size = 0;
        TreeNode nd, temp;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();

        queue.offer(root);

        while((size = queue.size()) != 0){
            while(size > 0){
                nd = queue.poll();
                temp = nd.left;
                nd.left = nd.right;
                nd.right = temp;
                if(nd.left != null) queue.offer(nd.left);
                if(nd.right != null) queue.offer(nd.right);
                size--;
            }
        }

        return root;

    }
}