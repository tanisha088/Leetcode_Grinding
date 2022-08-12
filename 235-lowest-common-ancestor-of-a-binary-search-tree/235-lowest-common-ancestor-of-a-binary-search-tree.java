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
            return null;
        
      TreeNode l = lowestCommonAncestor(root.left,p,q);
      TreeNode r = lowestCommonAncestor(root.right,p,q);
        
//      System.out.println(root.val);
        
//         if(l!=null)
//             System.out.println("l===>"+l.val);
        
//         if(r!=null)
//             System.out.println("r===>"+r.val);
        
        if(p==root || q==root)
            return root;
      
        if(l!=null && r==null)
            return l;
        
        if(r!=null && l==null)
            return r;
        
        if((r!=null && l!=null))
        return root;
        
        
        return null;
     
    }
}