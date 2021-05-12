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
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        
        TreeNode nodex =  find_node(root,x);
        
        int leftsubtree =  count(nodex.left,0);
        int rightsubtree = count(nodex.right,0);
        int totnodes = count(root,0);
        
        
        System.out.println(leftsubtree+" " + rightsubtree+"  "+ totnodes);
        if((2*(leftsubtree+rightsubtree+1)<totnodes) || (totnodes<2*leftsubtree) || (totnodes<2*rightsubtree))
        {
            return true;
        }
        
        return false;
    }
    
    public TreeNode find_node(TreeNode root,int x)
    {
        if(root==null)
            return null;
        
        if(root.val==x)
            return root;
        
       if(find_node(root.left,x)!=null)
           return find_node(root.left,x);
        
        if(find_node(root.right,x)!=null)
            return find_node(root.right,x);
        
        return null;
    }
    
    public int count(TreeNode root,int c)
    {
        if(root==null)
            return 0;
        
        int a = count(root.left,c);
        int b = count(root.right,c);
        
        return a+b+1;
    }
}
