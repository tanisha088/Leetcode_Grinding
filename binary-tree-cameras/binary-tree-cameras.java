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
    int ans=0;
        public int minCameraCover(TreeNode root) {

            // no camera at leaf node , 2 type -> 1. monitored 2. non-monitored 
    //    }
    /*
    int ans=0;
    public int minCameraCover(TreeNode root) {
        
        if(root==null)
            return 0;
     
        int rval = numcamera(root);
        if(rval==0)
            ans++;
        return ans;
    }
    
    public int numcamera(TreeNode root)
    {
      if(root==null)
          return 2;
        
        if(root.left==null && root.right==null)
            return 0;
        
        int a = numcamera(root.left);
        int b = numcamera(root.right);
        
        // options ::
     //   0 0  , 0 1 , 0 2 , 1 2 , 1 1 , 2 2             
        
        // 0 0  , 0 1 , 0 2
        if(a==0 || b==0 )
        {
            ans++;
            return 1;
        }
        else if(a==1 || b==1)
        {
            return 2;
        }
        else
        {
            return 0;
        }
    }
    
    */
//     if(root==null)
//         return 0;
//            int[] ar =  new int[]{0};
//     int k =  fn(root,ar);
            
//             if(k==-1)
//                  ar[0]+=1;
            
//             return ar[0];
            
            int k =  fn(root);
            
            if(k==-1)
                return ans+1;
            
            return ans;
            
         
} 
    
    // 1- actual   0-partial -1 - none
    public int fn(TreeNode root)
    {
             if(root==null)
                 return 0;
           
            int a = fn(root.left);
        int b = fn(root.right);
        
        if(a==-1 || b==-1)
        {
            ans+=1;
            return 1;
        }
        
        if(a==1 || b==1)
            return 0;
        
        return -1;
    }
}





/*




leaf - not install -> -1  ,  0  , 1 

leaf - return -1

l=-1 || r=-1 -> 1 


l==0 && r==0 ->  -1

 return 1

0  0
0  1
1   1







*/