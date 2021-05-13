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
    public int minCameraCover(TreeNode root) {
        
        if(root==null)
            return 0;
     
        int rval = numcamera(root);
        if(rval==0)
            ans++;
        return ans;
    }
    
    public int numcamera(TreeNode root)
    {
      if(root==null)
          return 2;
        
        if(root.left==null && root.right==null)
            return 0;
        
        int a = numcamera(root.left);
        int b = numcamera(root.right);
        
        // options ::
     //   0 0  , 0 1 , 0 2 , 1 2 , 1 1 , 2 2
        
        // 0 0  , 0 1 , 0 2
        if(a==0 || b==0 )
        {
            ans++;
            return 1;
        }
        else if(a==1 || b==1)
        {
            return 2;
        }
        else
        {
            return 0;
        }
    }
    
    
}