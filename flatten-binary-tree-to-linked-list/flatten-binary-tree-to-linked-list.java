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
        
    public void flatten(TreeNode root) {
            
        fn(root);
    }
    
    public TreeNode fn(TreeNode root)
    {
        if(root==null)
            return root;
        if(root.left==null && root.right==null)
            return root;
        
        TreeNode l = fn(root.left);
        TreeNode r = fn(root.right);
        
        if(root.left==null)
        {
            return r;
        }
        else if(root.right==null)
        {
            root.right = root.left;
            // V.IMP TO DO THIS
            root.left=null;
            return l;
        }
        else
        {
            TreeNode k = root.right;
            root.right = root.left;
            l.right =k;
            // V IMP TO DO THIS
            root.left=null;
            return r;
        } 
        
    }
   
    //  
}