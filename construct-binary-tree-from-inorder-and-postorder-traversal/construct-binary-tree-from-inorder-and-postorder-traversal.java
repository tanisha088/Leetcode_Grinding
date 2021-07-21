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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
          
        return build(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
        
        
    }
    
    public TreeNode build(int[] in,int[] post,int is,int ie,int ps,int pe)
    {
        if(is>ie || ps>pe)
            return null;
        
        if(is==ie)
            return new TreeNode(in[is]);
        
        int  m  = post[pe];
        
        int index =0;
        for(int i=0;i<in.length;i++)
            if(in[i]==m)
            {
                index = i;
                break;
            }
    
            TreeNode root =  new TreeNode(m);
        
        root.left = build(in,post,is,index-1,ps,ps+index-is-1);
        root.right = build(in,post,index+1,ie,ps+index-is,pe-1);
        
        
        return root;
    }
}

