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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        
        /*
        if(targetSum==0)
            return true;
        
        if(root==null)
            return false;
        
        boolean l = hasPathSum(root.left,targetSum-root.val);
        boolean r = hasPathSum(root.right,targetSum-root.val);
        
        return l||r;
        */
        if(root==null)
            return false;
        return hps(root,targetSum,0);
    }
    
    public boolean hps(TreeNode root,int targetSum,int tot)
    {
       
           if(root==null)
            return false;
        
        
        if(tot+root.val==targetSum && root.left==null && root.right==null)
            return true;
        
     
        
        boolean l = hps(root.left,targetSum,tot+root.val);
        boolean r = hps(root.right,targetSum,tot+root.val);
        
        return l||r;
        
    }
}