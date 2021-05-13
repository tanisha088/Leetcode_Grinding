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
    public int distributeCoins(TreeNode root) {
        
        distri(root);
        return ans;
    }
    
    public int distri(TreeNode root)
    {
        if(root==null)
            return 0;
        
        int l = distri(root.left);
        int r = distri(root.right);
        
        ans= ans+ Math.abs(l)+ Math.abs(r);
        
        return l+r-1+root.val;
    }
}