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
    int ans=0;
    public int rob(TreeNode root) {
       
        fn(root);
        
        return ans;
    }
    
    public int[] fn(TreeNode root)
    {
        if(root==null)
            return new int[2];
        
        int[] l =  fn(root.left);
        int[] r = fn(root.right);
        
        int inc =  l[1] + r[1]+root.val;
        int exc = 0;
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                exc = Math.max(exc,l[i]+r[j]);
            }
        }
        
        ans = Math.max(exc,inc);
        
        return new int[]{inc,exc};
        
    }
}