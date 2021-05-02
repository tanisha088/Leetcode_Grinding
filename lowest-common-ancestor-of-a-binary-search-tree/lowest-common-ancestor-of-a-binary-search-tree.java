/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return root;
        
        if(p.val==root.val || q.val==root.val || (p.val<root.val && q.val>root.val)||(p.val>root.val && q.val<root.val))
            return root;
        TreeNode ans1;
        TreeNode ans2;
    ans1 = lowestCommonAncestor(root.left,p,q);
      ans2 = lowestCommonAncestor(root.right,p,q);
       
     return (ans1==null)?ans2:ans1;   
    }
}