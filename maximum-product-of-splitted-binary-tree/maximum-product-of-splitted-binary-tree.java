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
    long ans=0;
    public int maxProduct(TreeNode root) {
        int mod= 1000000007;
         long sum = calcsum(root);
        result(root,sum);
        return (int)(ans%mod);
    }
    
    public long calcsum(TreeNode root)
    {
        if(root==null)
            return 0;
        
        return calcsum(root.left)+calcsum(root.right)+root.val;
    }
    
    public long result(TreeNode root,long totsum)
    {
        if(root==null)
            return 0;
        
        long subtree = result(root.left,totsum) + result(root.right,totsum) + root.val;
        
        long leftsum = totsum - subtree;
        
        ans = Math.max((leftsum*subtree),ans);
        return subtree;
    }
    
}










