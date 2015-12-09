/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class BSTIterator {

    Stack<TreeNode> stack;

    public BSTIterator(TreeNode root) {
        this.stack = new Stack<TreeNode>();
        extend(root);
    }

    /** @return whether we have a next smallest number */
    public boolean hasNext() {
        return stack.size() == 0 ? false : true;
    }

    /** @return the next smallest number */
    public int next() {
        TreeNode temp = stack.pop();
        extend(temp.right);
        return temp.val;
    }

    void extend(TreeNode root){
        while(root != null){
            stack.push(root);
            root = root.left;
        }

    }




}

/**
 * Your BSTIterator will be called like this:
 * BSTIterator i = new BSTIterator(root);
 * while (i.hasNext()) v[f()] = i.next();
 */
