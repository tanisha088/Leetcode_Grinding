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
    public int countNodes(TreeNode root) {
        
        if(root==null)
            return 0;
        
        int c=  heightl(root);
        int c2 = heightr(root);
        
        if(c==c2)
        {
            return (1<<c)-1;
        }
        
        return countNodes(root.left) + countNodes(root.right)+1;
    }
    
    public int heightl(TreeNode root)
    {
        if(root==null)
            return 0;
        
        return 1+heightl(root.left);
    }
    
       public int heightr(TreeNode root)
    {
        if(root==null)
            return 0;
        
        return 1+heightr(root.right);
    }
   
}