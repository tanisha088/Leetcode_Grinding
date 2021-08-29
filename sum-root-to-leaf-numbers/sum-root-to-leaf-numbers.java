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
    public int sumNumbers(TreeNode root) {
      
        
        
        // 1ST APPROACH ---> TAKE SAARA NODE TO LEAF PATH IN A LIST AND THEN UNKA SUM NIKAL LO
        /*
        List<String> list= new ArrayList<String>();
        fn(root,"",list);
        int sum=0;
        for(int i=0;i<list.size();i++)
            sum=sum+Integer.parseInt(list.get(i));
        return sum;
        */
        
       // 2ND APPROACH
       // return summing(root,0);
        
        // 3RD APPROACH
        return fn(root,"");
    }
    
      public int fn(TreeNode root,String str)
    {
        if(root==null)
            return 0;
        
          int sum=0;
        if(root.left==null && root.right==null)
        {
String m = str+Integer.toString(root.val);
        return Integer.parseInt(m);
        }
          
        
       int k1 =  fn(root.left,str+Integer.toString(root.val));
       int k2 = fn(root.right,str+Integer.toString(root.val));
          
          return k1+k2;
    }
    
    public int summing(TreeNode root,int sum)
    {
//         if(root==null)
//             return 0;
        
//         if(root.left==null && root.right==null)
//         {
//             sum = sum*10+root.val;
//             return sum;
//         }
        
//         int l = summing(root.left,sum*10+root.val);
//         int r = summing(root.right,sum*10+root.val);
        
//         return l+r;
        
        if(root==null)
            return 0;
        
        int nsum = 10*sum+root.val;
        
        int l = summing(root.left,nsum);
        int r = summing(root.right,nsum);
        
        return  l + r + nsum;
  
    }
    
    public void fn(TreeNode root,String str,List<String> list)
    {
        if(root==null)
            return;
        
        if(root.left==null && root.right==null)
        {
            list.add(str+Integer.toString(root.val));
        }
        fn(root.left,str+Integer.toString(root.val),list);
        fn(root.right,str+Integer.toString(root.val),list);
    }
}
























 
 
 
