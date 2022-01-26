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
    
    
    
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
       
        List<Integer> l1 =  new ArrayList();
        List<Integer> l2 =  new ArrayList();
        List<Integer> l =  new ArrayList();
        
        in(root1,l1);
        in(root2,l2);
        int i=0;
        int j=0;
        while(i<l1.size() && j<l2.size())
        {
            if(l1.get(i)<=l2.get(j))
            {
                l.add(l1.get(i));
                i++;
            }
            else if(l1.get(i)>l2.get(j))
            {
                l.add(l2.get(j));
                j++;
            }
        }
        
        while(i<l1.size())
            l.add(l1.get(i++));
        
        while(j<l2.size())
            l.add(l2.get(j++));
        
        return l;
    }
    
    public void in(TreeNode r,List<Integer> ll )
    {
        if(r==null)
            return;
        
        in(r.left,ll);
        ll.add(r.val);
        in(r.right,ll);
    }
}