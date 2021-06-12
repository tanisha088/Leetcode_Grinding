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
    TreeNode m = null;
    public TreeNode deleteNode(TreeNode root, int key) {
        
        if(root==null)
            return root;
        
        if(root.val>key)
        {
            root.left = deleteNode(root.left,key);
        }
        else if(root.val<key)
        {
            root.right = deleteNode(root.right,key);
        }
        else
        {
            root = delete(root);
        }
        
        return root;
    }
    
    public TreeNode delete(TreeNode root)
    {
         if(root.left==null)
             return root.right;
        if(root.right==null)
            return root.left;
        
        TreeNode k = root.left;
        while(k.right!=null)
            k=k.right;
        
        int nv = k.val;
        root.val = nv;
        
        root.left  = deleteNode(root.left,nv);
        
        return root;
    }
}