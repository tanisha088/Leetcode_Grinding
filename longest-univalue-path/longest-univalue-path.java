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
    public int longestUnivaluePath(TreeNode root) {
        
        fn(root);
        return ans;
    }
    
    public int fn(TreeNode root)
    {
       if(root==null)
           return 0;
        
        if(root.left==null && root.right==null)
            return 0;
        
        int l =fn(root.left);
        int r =fn(root.right);
        int rtval = 0;
        boolean b =false;
        if(root.left!=null && root.left.val==root.val)
        {
            ans = Math.max(ans,l+1);
            rtval = l+1;
            b=true;
        }
        
        if(root.right!=null && root.right.val==root.val)
        {
            ans= Math.max(ans,r+1);
            rtval  =Math.max(rtval,r+1);
            if(b)
                ans=Math.max(ans,l+r+2);
        }
        
        return rtval;
        
        /*
        int l = fn(root.left);
        if(root.left!=null)
        {
            if(root.left.val==root.val)
                l=l+1;
            else
                l=0;
        }
        int r = fn(root.right);
        if(root.right!=null)
        {
            if(root.right.val==root.val)
                r=r+1;
            else
                r=0;
        }
        ans = Math.max(ans,l+r);
        return Math.max(l,r);
        */
    }
}
