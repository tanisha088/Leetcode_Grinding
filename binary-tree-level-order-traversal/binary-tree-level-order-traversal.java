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
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<TreeNode> ll = new LinkedList<TreeNode>();
        
        LinkedList<Integer> vals=  new LinkedList<Integer>();
             List<List<Integer>> ans = new ArrayList<List<Integer>>();

        ll.add(root);
        
           /*
        vals.add(0);
        int v = -1;
        
        if(root==null)
            return ans;
        List<Integer> l1= new ArrayList<Integer>();
        while(!ll.isEmpty())
        {
         TreeNode node = ll.removeFirst(); 
            int lv =  vals.removeFirst();
            
            if(lv!=v)
            {
                if(v!=-1)
                   ans.add(l1);
             l1 = new ArrayList<Integer>();
                v++;
            }
            
            l1.add(node.val);
            
            if(node.left!=null)
            {
                ll.add(node.left);
                vals.add(lv+1);
            }
            if(node.right!=null)
            {
                ll.add(node.right);
                vals.add(lv+1);
            }
        }
        
        ans.add(l1);
        */
        
        if(root==null)
            return ans;
        while(!ll.isEmpty())
        {
            int size =  ll.size();
            List<Integer> res = new ArrayList<Integer>();
            while(size!=0)
            {
                TreeNode m = ll.remove();
                res.add(m.val);
                if(m.left!=null)
                    ll.add(m.left);
                if(m.right!=null)
                    ll.add(m.right);
                size--;
            }
            ans.add(res);
        }
        
        return ans;
    }
}