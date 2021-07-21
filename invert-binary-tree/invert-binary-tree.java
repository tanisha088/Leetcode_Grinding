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
    public TreeNode invertTree(TreeNode root) {
        
        
        if(root==null)
            return root;
        
        TreeNode m = invertTree(root.left);
        TreeNode m1 = invertTree(root.right);
        
        root.left = m1;
        root.right = m;
        
        return root;
    }
        /*
       it(root.left,root.right);
        
        return root;
    }
    
    public void it(TreeNode r1, TreeNode r2)
    {
        if(r1==null || r2==null)
            return;
        
        
        int t1 = r1.val;
        r1.val=r2.val;
        r2.val=t1;
        
        it(r1.left,r2.right);
        it(r1.right,r2.left);
    }
    */
}