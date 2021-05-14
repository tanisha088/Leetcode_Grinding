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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        if(depth==1)
        {
            TreeNode node = new TreeNode(val);
            node.left=root;
            return node;
        }
        fn(root,val,depth);
        return root;
    }
    
    public void fn(TreeNode root,int val,int depth)
    {
        if(root==null)
            return;
        
        if(depth==2)
        {
            TreeNode m  = root.left;
            TreeNode n = root.right;
            
            TreeNode m1 = new TreeNode(val);
            TreeNode n1 = new TreeNode(val);
            
            m1.left = m;
            n1.right = n;
            
            root.left =m1;
            root.right = n1;
        }
        
        fn(root.left,val,depth-1);
        fn(root.right,val,depth-1);
            
    }
}