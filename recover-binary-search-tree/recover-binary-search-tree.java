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
    
    
    public void recoverTree(TreeNode root) {

        TreeNode prev= null;
        TreeNode first =null;
        TreeNode second = null;
        
        while(root!=null)
        {
            if(root.left!=null)
            {
                TreeNode m = root.left;
                while(m.right!=null && m.right!=root)
                    m=m.right;
                
                if(m.right==null)
                {
                    m.right = root;
                    root=root.left;
                }
                else
                {
                     
                       if(prev.val>root.val)
                {
                 ///                       System.out.println(prev.val+" "+root.val+" ***"+" ");

                    if(first==null)
                    {
                        first = prev;
                        second = root;
                    }
                    else
                    {
                        second = root;
                    }
                           
                                    
                }
                    prev= root;
                   root  = root.right;
                    m.right=null;
                }
            }
            else
            {
                
                if(prev!=null && prev.val>root.val)
                {
                    if(first==null)
                    {
                        first = prev;
                        second = root;
                    }
                    else
                    {
                        second = root;
                    }
                }
                   
              
                prev=root;
               root=root.right;
            }
        }
        
      //  System.out.println(first.val+" "+second.val);
        int val = first.val;
        first.val =  second.val;
        second.val = val;
        
        
        
        /*
        TreeNode prev =null;
        TreeNode first=null;
        TreeNode second =null;
        while(root!=null)
        {
            if(root.left==null)
            {
                if(prev!=null)
                    if(root.val<prev.val)
                    {
                        if(first==null)
                            first=prev;
                    if(first!=null)
                     second=root;
                    }
                prev=root;
                
                root=root.right;
            } 
                else
                {
                    TreeNode m = root.left;
                    while(m.right!=null && m.right!=root)
                    {
                        m=m.right;
                    }
                    if(m.right==null)
                    {
                        m.right=root;
                        root=root.left;
                    }
                    else
                    {
                        
                     if(prev!=null)
                    if(root.val<prev.val)
                    {
                        if(first==null)
                            first=prev;
                       if(first!=null) 
                     second=root;
                    }
                        prev=root;
                        m.right=null;
                        root=root.right;
                        
                    }
                }
            
            }
        
         int t = first.val;
        first.val = second.val;
        second.val = t;
        */
    }
    
        
}