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
    public TreeNode sortedArrayToBST(int[] nums) {
        return atobst(nums,0,nums.length);
    }
    
    public TreeNode atobst(int[] nums,int st,int end)
    {if(st>end || st>=nums.length)
        return null;
        int mid = st+(end-st)/2;
   //  System.out.println(st+" "+end+" "+mid);
        TreeNode k = new TreeNode(nums[mid]);
        k.left = atobst(nums,st,mid-1);
        k.right = atobst(nums,mid+1,end);
        
        return k;
        
    }
}