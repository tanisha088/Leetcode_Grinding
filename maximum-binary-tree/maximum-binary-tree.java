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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        
        return fn(nums,0,nums.length-1);
    }
    
    public TreeNode fn(int[] nums,int st,int end)
    {
        if(st>end)
            return null;
        if(st==end)
            return new TreeNode(nums[st]);
        
       int max=st;
        for(int i=st;i<=end;i++)
            {
               if(nums[i]>=nums[max])
                   max=i;
                   
        }
        
        TreeNode root = new TreeNode(nums[max]);
        
        root.left = fn(nums,st,max-1);
        root.right = fn(nums,max+1,end);
        
        return root;
        
               
    }
}



