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
    TreeNode val = null;
    public int findBottomLeftValue(TreeNode root) {
        
        int height = h(root);
        lot(root,height);
        
        return val.val;
    }
    
    public int h(TreeNode root)
    {
        if(root==null)
            return 0;
        
        return 1+ Math.max(h(root.left),h(root.right));
    }
    public void lot(TreeNode root,int level)
    {
        if(root==null)
            return;
        
        if(level==1 && val==null)
            val=root;
        
        lot(root.left,level-1);
        lot(root.right,level-1);
    }
}