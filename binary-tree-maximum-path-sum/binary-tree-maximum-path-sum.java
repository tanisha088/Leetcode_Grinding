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
   int ans= Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
     
        
       // FIRST APPROACH ::::
   // int a =maxPathSum1(root);
 
        
        // 2ND APPROACH ::::
    int a = max(root);
        
        return Math.max(ans,a);
    }
    
    public int max(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int v1 = Math.max(0,max(root.left));
        int v2 = Math.max(0,max(root.right));
        
        
       ans = Math.max(v1+v2+root.val,ans);
        
        return Math.max(v1,v2)+root.val;
           
        
    }
    
    
    public int maxPathSum1(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int v1 = maxPathSum1(root.left);
        int v2 = maxPathSum1(root.right);
        
        
       ans = Math.max(v1+v2+root.val,Math.max(v1+root.val,Math.max(v2+root.val,Math.max(root.val,ans))));
        
        return Math.max(v1+root.val,Math.max(root.val+v2,root.val));
           
        
    }
    
   
}