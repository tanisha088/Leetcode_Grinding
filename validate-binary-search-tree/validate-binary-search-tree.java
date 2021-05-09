/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {
        
    //  return valid(root,Long.MIN_VALUE,Long.MAX_VALUE);
        
        return c(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
    public boolean c(TreeNode root,long min ,long max)
    {
        if(root==null)
            return true;
        
        if(root.val<=min || root.val>=max)
            return false;
        
        return c(root.left,min,root.val) && c(root.right,root.val,max);
    }
    
    public boolean valid(TreeNode root,long min ,long max)
    {
         if(root==null)
             return true;
        int v1=root.val;
        if(v1<=min || v1>=max)
            return false;
        
        return(valid(root.left,min,root.val) && valid(root.right,root.val,max));
    }
}
