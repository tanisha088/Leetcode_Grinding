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
     
        int[] a1 =  new int[]{Integer.MIN_VALUE};
       int m =  maxsum(root,a1);
        return Math.max(m,a1[0]);
    }
    
    public int maxsum(TreeNode root,int[] ans)
    {
        if(root==null)
            return 0;
        
        // lsum+node , rsum+node , just node
        
        int sum1 = maxsum(root.left,ans);
        int sum2 = maxsum(root.right,ans);
        
        int max = Math.max(sum1+root.val,Math.max(sum2+root.val,root.val));
        
        ans[0]=Math.max(root.val+sum1+sum2,Math.max(ans[0],max));
        
        return max;
    }
        
        /*
        
       // FIRST APPROACH ::::
   // int a =maxPathSum1(root);
 // return Math.max(ans,a);
        
        // 2ND APPROACH ::::
  //  int a = max(root);
        // return Math.max(ans,a);
        
        // 3RD APPROACH ::
       return maxfn(root)[1];
        
       
    }
    
    
    public int[] maxfn(TreeNode root)
    {
        if(root==null)
        {
            return new int[]{0,Integer.MIN_VALUE};
        }
        
        int[] v1 = maxfn(root.left);
        int[] v2 = maxfn(root.right);
        
        int tot=root.val;
        
        if(v1[0]<0)
            v1[0]=0;
        if(v2[0]<0)
            v2[0]=0;
        
        tot += v1[0]+v2[0];
        
        int[] ans= new int[2];
        
        ans[1] =  Math.max(v1[1], Math.max(v2[1],tot));
        
        ans[0] = Math.max(v1[0],v2[0])+root.val;
        
        return ans;
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
    
   */
}