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
    
    int sum=0;
    
    public int findTilt(TreeNode root) {
    
        fn(root);
        
        return sum;
    }
    
    public int fn(TreeNode root)
    {
         if(root==null)
            return 0;
        
        int l = fn(root.left);
        int r=  fn(root.right);
        
        sum = sum + Math.abs(l-r);
        
        return l+r+root.val;
    }
}