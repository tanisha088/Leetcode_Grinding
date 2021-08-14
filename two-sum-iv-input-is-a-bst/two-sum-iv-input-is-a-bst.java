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
        
        if(root==null)
            return false;
        
        Stack<TreeNode> low = new Stack();
        Stack<TreeNode> hi =  new Stack();
        TreeNode v1 = null;
        TreeNode v2 = null;
        boolean l1 =  false;
        boolean l2 = false;
        TreeNode r1 = root;
        TreeNode r2 = root;
        
        while(true)
        {
            while(l1==false)
            {
                while(r1!=null)
                {
                    low.push(r1);
                    r1=r1.left;
                }
                
                if(low.isEmpty())
                    return false;
                
                v1 = low.peek();
                r1 = low.pop().right;
                l1=true;
            }
            
             while(l2==false)
            {
                while(r2!=null)
                {
                    hi.push(r2);
                    r2=r2.right;
                }
                
                 if(hi.isEmpty())
                     return false;
                 
                v2 = hi.peek();
                r2 = hi.pop().left;
                l2=true;
            }
            
            if(v1.val>=v2.val)
                return false;
            
            if(v1.val+v2.val == k)
                return true;
            if(v1.val + v2.val < k)
                l1=false;
            else
                l2=false;
        }
        
                
    }
}