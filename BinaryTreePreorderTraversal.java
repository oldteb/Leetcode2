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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new LinkedList<Integer>();
        if(root == null) return list;

        Stack<TreeNode> nodeStack = new Stack<TreeNode>();
        Stack<Integer> dirStack = new Stack<Integer>();
        nodeStack.push(root);
        dirStack.push(0);
        int status = 0;
        TreeNode temp;

        while(nodeStack.size() != 0){
            temp = nodeStack.peek();
            switch(dirStack.peek()){
                case 0:  // new creation
                    list.add(temp.val);
                    if(temp.left != null){
                        dirStack.pop();
                        dirStack.push(1);
                        nodeStack.push(temp.left);
                        dirStack.push(0);
                    }
                    else{
                        dirStack.pop();
                        dirStack.push(1);
                    }
                    break;

                case 1:  // left branch complete
                    if(temp.right != null){
                        dirStack.pop();
                        dirStack.push(2);
                        nodeStack.push(temp.right);
                        dirStack.push(0);
                    }
                    else{
                        dirStack.pop();
                        dirStack.push(2);
                    }
                    break;

                case 2:  // return to upper level
                    nodeStack.pop();
                    dirStack.pop();
                    break;
            }
        }

        return list;
    }
}
