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
    public boolean findTarget(TreeNode root, int k) {
        
//         ArrayList<Integer> list= new ArrayList<Integer>();
//         inorder(root,list);
//         int i=0;
//         int j=list.size()-1;
//         while(i<j)
//         {
//             int sum = list.get(i)+list.get(j);
//             if(sum==k)
//                 return true;
//             if(sum<k)
//                 i++;
//             else
//                 j--;
//         }
//         return false;
//     }
    
//     public void inorder(TreeNode root,ArrayList<Integer> list)
//     {
//         if(root==null)
//             return ;
        
//         inorder(root.left,list);
//         list.add(root.val);
//         inorder(root.right,list);
//     }
         Stack<TreeNode> st1=new Stack();
        Stack<TreeNode> st2 = new Stack();
        
        TreeNode r1 = root;
        TreeNode r2 = root;
        
        boolean t1=false;
        boolean t2=false;
        int v1=-1;
        int v2=-1;
        while(true)
        {
    
            while(t1==false)
            {
               while(r1!=null)
               {
                   st1.push(r1);
                   r1=r1.left;
               }
               
                TreeNode m = st1.pop();
              v1= m.val;
              r1= m.right;
              t1=true;
            }
            
            
            while(t2==false)
            {
                  while(r2!=null)
               {
                   st2.push(r2);
                   r2=r2.right;
               }
              
              TreeNode m = st2.pop();
              v2= m.val;
              r2= m.left;
              t2=true;
            }
            
             if(v1>=v2)
            return false;
            
            if(v1+v2==k && v1!=v2)
            return true;
            else if(v1+v2>k)
            {
                t2=false;
            }
            else
                  t1=false;
            
            
        }
        
                
    }
}