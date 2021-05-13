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
        
        List<String> list= new ArrayList<String>();
        
        fn(root,"",list);
        
        int sum=0;
        
        for(int i=0;i<list.size();i++)
            sum=sum+Integer.parseInt(list.get(i));
        
        return sum;
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