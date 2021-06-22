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
    public int rob(TreeNode root) {
        
    int[] arr=  fn(root);
        
        return Math.max(arr[0],arr[1]);
    }
    
    public int[] fn(TreeNode root)
    {
        if(root==null)
            return new int[]{0,0};
        
        int[] l1 = fn(root.left);
        int[] r1 = fn(root.right);
        
        int v1 = l1[0]+r1[0]+root.val;
      int v2 = Math.max(l1[1]+r1[1],Math.max(l1[0]+r1[1],Math.max(l1[0]+r1[0],l1[1]+r1[0])));
         
        //int v2 = Math.max(l1[0],l1[1])+Math.max(r1[0],r1[1]);
        
        l1[1]=v1;
        l1[0]=v2;
        
        return l1;
    }
}