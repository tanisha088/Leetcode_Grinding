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
    
        public TreeNode deleteNode(TreeNode root, int key) {
          
            if(root==null)
                return root;
            
            if(root.val>key)
            {
                root.left =  deleteNode(root.left,key);
            }
            else if(root.val<key)
            {
                root.right = deleteNode(root.right,key);
            }
            else
            {
                return del(root);
            }
            
            return root;
        }
    
    
        public TreeNode del(TreeNode root)
        {
            if(root.left==null && root.right==null)
                return null;
            
            else if(root.left==null)
                return root.right;
            else if(root.right==null)
                return root.left;
            else
            {
                TreeNode m = root.left;
                while(m.right!=null)
                    m=m.right;
                root.val = m.val;
               root.left =  deleteNode(root.left,m.val);
                
                return root;
            }
        }
    
    
    
    
    
    
//     TreeNode m = null;
//     public TreeNode deleteNode(TreeNode root, int key) {
        
//         if(root==null)
//             return root;
        
//         if(root.val>key)
//         {
//             root.left = deleteNode(root.left,key);
//         }
//         else if(root.val<key)
//         {
//             root.right = deleteNode(root.right,key);
//         }
//         else
//         {
//             root = delete(root);
//         }
        
//         return root;
//     }
    
//     public TreeNode delete(TreeNode root)
//     {
//          if(root.left==null)
//              return root.right;
//         if(root.right==null)
//             return root.left;
        
//         TreeNode k = root.left;
//         while(k.right!=null)
//             k=k.right;
        
//         int nv = k.val;
//         root.val = nv;
        
//         // V IMP TO SEE THAT 
//         root.left  = deleteNode(root.left,nv);
        
//         return root;
//     }
}