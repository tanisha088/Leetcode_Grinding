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
    public TreeNode increasingBST(TreeNode root) {
        
        Stack<TreeNode> st=  new Stack<TreeNode>();
        TreeNode res = null;
        TreeNode k1 = null;
    
        while(!st.isEmpty() || root!=null)
        {
            while(root!=null)
            {
                st.push(root);
                root=root.left;
            }
            TreeNode p2 = st.pop();
            if(res==null)
            {
                res=new TreeNode(p2.val);
                k1=res;
            }
            else
            {
                k1.right=new TreeNode(p2.val);
                k1.left=null;
                k1 = k1.right;
            }
            
       //     System.out.println(k1.val+" "+p2.val);
            
            root=p2.right;
            
            
          
        }
        
        return res;
    }
}


// 5->3->2->