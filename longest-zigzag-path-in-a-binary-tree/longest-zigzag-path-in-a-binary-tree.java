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
    
    /*
    int c1=-1;
    int c2=-1;
    public int longestZigZag(TreeNode root) {
        
        l1(root);
        c2=0;
     //   l1(root.right);
        System.out.println(c1+" "+c2);
        return Math.max(c1,c2);
    }
    
    public void l1(TreeNode root)
    {
        if(root==null)
            return;
        
        if(c2==-1)
        {
            c1++;
            System.out.println(root.val+" "+c1);
            if(c1%2==0)
                l1(root.left);
            else
                l1(root.right);
        }
        else 
        {
            c2++;
            if(c2%2==0)
                l1(root.left);
            else
                l1(root.right);
        }
    }
    
    */
    
    int ans;
      public int longestZigZag(TreeNode root) {
       
          int[] m = zig(root);
          
          return ans;
      }
    
    public int[] zig(TreeNode root)
    {
        if(root==null)
            return new int[]{0,0};
        
        int[] l  = zig(root.left);
        int[] r = zig(root.right);
        
        int[] arr = new int[2];
        
        
        if(root.left!=null)
        {
            arr[0]=1+l[1];
        }
        
        if(root.right!=null)
        {
            arr[1]= 1+r[0];
        }
        
        ans=Math.max(arr[0],Math.max(ans,arr[1]));
        
                System.out.println(arr[0]+" "+arr[1]+" "+root.val);

        
        return arr;
    }
}
