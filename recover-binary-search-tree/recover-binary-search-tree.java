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
    TreeNode prev=null;
    TreeNode first=null;
    TreeNode second=null;
    public void recoverTree(TreeNode root) {

        rt(root);
        
        int t = first.val;
        first.val = second.val;
        second.val = t;
    }
    
    public void rt(TreeNode root)
    {
        if(root==null)
            return;
        
        rt(root.left);
        
        if(prev!=null)
       if(root.val<prev.val)
        {
            if(first==null)
            {
                first = prev;
            }
             if(first!=null)
                second = root;
        }
        
        prev= root;
        
        rt(root.right);
        
    }
        
}