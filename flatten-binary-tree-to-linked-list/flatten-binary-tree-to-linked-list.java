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
           return null;
        
        TreeNode a =  fn(root.left);
        TreeNode b =  fn(root.right);
        
        if(a==null && b==null)
            return root;
        
        if(a==null)
            return b;
        
       if(b==null)
       {
           root.right = root.left;
           root.left = null;
           
           return a;
       }
        
        
        TreeNode k =  root.right;
        root.right = root.left;
        root.left = null;
        a.right = k;
        return b;
        
    }
   
    //  
}