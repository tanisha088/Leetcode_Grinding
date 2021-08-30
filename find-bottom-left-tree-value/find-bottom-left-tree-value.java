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
    
    
    int ans;
    int k;
    
    public int findBottomLeftValue(TreeNode root) {
        
        // 1ST APPROACH --->
     //   int height = h(root);
     //   lot(root,height);
     // return val.val;
        
        // 2ND APPROACH ---> 
//         int[] res= new int[2];
//         res[0]=0;
//         res[1]=-1;
//         inorder(root,0,res);
        
//         return res[0];
        
        ans=0;
        k=-1;
        
        fn(root,0);
        
        return ans;
    }
    
    public void fn(TreeNode root,int lev)
    {
        if(root==null)
            return;
        
        fn(root.left,lev+1);
        
        if(lev>k)
        {
            ans = root.val;
            k = lev;
        }
        
        fn(root.right,lev+1);
    }
    
    
    
//     public void inorder(TreeNode root,int level,int[] res)
//     {
//         if(root==null)
//             return;
        
//           if(level>res[1])
//         {
//             res[0]=root.val;
//             res[1]=level;
//         }
        
//         inorder(root.left,level+1,res);
//         inorder(root.right,level+1,res);
        
      
//     }
    
//     public int h(TreeNode root)
//     {
//         if(root==null)
//             return 0;
        
//         return 1+ Math.max(h(root.left),h(root.right));
//     }
//     public void lot(TreeNode root,int level)
//     {
//         if(root==null)
//             return;
        
//         if(level==1 && val==null)
//             val=root;
        
//         lot(root.left,level-1);
//         lot(root.right,level-1);
//     }
}














//     5
//    / \ 
//    3  4
//      /\
//      2 1
    
        
//         k , ans
        
//         5,0
//         3,1
        
//         if(param>k)
//              ans=node.val













