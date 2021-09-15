/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode  right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean btreeGameWinningMove(TreeNode root, int n, int x) {
        
        /*
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
    */
        
        
   //     **************************** WRONG SOLUTION **********************************
//         if(root.val==x)
//             return false;
//         int[]  arr = new int[1];
//         arr[0]=-1;
//         int c = count_nodes(root,arr,x);
        
//         int onesubtree = c-arr[0];
        
//         if(onesubtree == arr[0])
//             return false;
        
//         return true;
//     }
    
//     public int count_nodes(TreeNode root,int[] arr,int x)
//     {
//         if(root==null)
//             return 0;
        
//         int c1 =  count_nodes(root.left,arr,x);
//         int c2 = count_nodes(root.right,arr,x);
        
//         int ans = c1+  c2 + 1;
        
//         if(x==root.val)
//         {
//             arr[0]=ans;
//         }
        
//         return ans;
        
//     }
        
     // **************************** WRONG SOLUTION **********************************
        
     
        int[] arr =  new int[]{0,0,0};
        
      int m =   counts(root,arr,x);
        
        int par = m - arr[0];
        
        return Math.max(par,Math.max(arr[1],arr[2])) > m/2 ? true:false;
        
    }
    
    public int counts(TreeNode root,int[] arr,int x)
    {
        if(root==null)
            return 0;
        
        int l = counts(root.left,arr,x);
        int r=  counts(root.right,arr,x);
        
        if(root.val==x)
        {
            arr[0]=l+r+1;
            arr[1]=l;
            arr[2]=r;
        }
        
        return l+r+1;
    }
}
