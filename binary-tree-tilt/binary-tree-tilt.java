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
        sum=0;
    int[] ans =  fn(root);
        
        return ans[1];
      //  return sum;
    }
    
    public int[] fn(TreeNode root)
    {
        if(root==null)
            return new int[]{0,0};
        
        int[] j1 = fn(root.left);
        int[] j2 = fn(root.right);
       
       return new int[]{j1[0]+j2[0]+root.val,j1[1]+j2[1]+Math.abs(j1[0]-j2[0])};
       
     
    }
}