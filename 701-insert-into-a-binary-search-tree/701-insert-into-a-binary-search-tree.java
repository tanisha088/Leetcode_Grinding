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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
           if(root==null)
           {
               TreeNode n  = new TreeNode(val);
               return n;
           }
        
        if(root.val>val)
        {
            TreeNode n =  new TreeNode(val);
            root.left = insertIntoBST(root.left,val);
            return root;
        }
        else
        {
              TreeNode n =  new TreeNode(val);
            root.right = insertIntoBST(root.right,val);
            return root;            
        }
    }
}