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
    public List<Integer> rightSideView(TreeNode root) {
        
       int rv=-1;
        LinkedList<Integer> ans = new LinkedList<Integer>();
        LinkedList<TreeNode> ll= new LinkedList<TreeNode>();
        LinkedList<Integer> val = new LinkedList<Integer>();
   
        ll.add(root);
        val.add(0);
     
        if(root==null)
            return ans;
        
        while(!ll.isEmpty())
        {
            TreeNode m= ll.remove();
            int v = val.remove();
            
            if(val.isEmpty())
                ans.add(m.val);

            if(!val.isEmpty())
           {
                int k1 =val.removeFirst();
              if(k1!=v)
              {
               ans.add(m.val);
              }
              val.addFirst(k1);

           }
          
            if(m.left!=null)
            {
                ll.add(m.left);
                val.add(v+1);
            }
            if(m.right!=null)
            {
                ll.add(m.right);
                val.add(v+1);
            }
        }
        
        return ans;
        
    }
}