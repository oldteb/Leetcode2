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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p == null || q == null)  return root;
        int i;
        List<TreeNode> listP = new ArrayList<TreeNode>();
        List<TreeNode> listQ = new ArrayList<TreeNode>();

        help(root, p, listP);
        help(root, q, listQ);

        for(i = 0; i < Math.min(listP.size(), listQ.size()); i++){
            if(listP.get(i) == listQ.get(i))  continue;
            else return listP.get(i-1);
        }

        return listP.get(i-1);
    }

    int help(TreeNode root, TreeNode target, List<TreeNode> list){
        if(root == null)  return 0;
        else if(root == target){
            list.add(target);
            return 1;
        }
        else{
            list.add(root);
            if(help(root.left, target, list) == 1)  return 1;
            if(help(root.right, target, list) == 1)  return 1;
            list.remove(list.size()-1);
        }

        return 0;
    }
}
