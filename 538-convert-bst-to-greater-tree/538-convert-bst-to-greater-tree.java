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
    public TreeNode convertBST(TreeNode root) {
        
        int sum  = sum(root);
        
      fn(root,sum);
        return root;
    }
    
    public int sum(TreeNode root)
    {
        if(root==null)
            return 0;
        
        return sum(root.left) + sum(root.right) + root.val;
    }
    
    public int  fn(TreeNode root,int sum)
    {
        if(root==null)
            return 0;
        
     //   System.out.println(root.val+" "+sum);
        
        int b  = fn(root.left,sum);
        int a  = fn(root.right,sum-b-root.val);
        int va = root.val;
        root.val = sum - b;
        
        return a + b + va;
    }
}
