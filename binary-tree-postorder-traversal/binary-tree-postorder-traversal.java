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
    public List<Integer> postorderTraversal(TreeNode root) {
         LinkedList<Integer> ll = new LinkedList<Integer>();
        
        while(root!=null)
        {
            ll.add(root.val);
            if(root.right==null)
            {
                root=root.left;
            }
            else
            {
                TreeNode node =  root.right;
                while(node.left!=null && node.left!=root)
                  node=node.left;
                
                if(node.left==null)
                {
                    node.left =root;
                    root = root.right;
                }
                else
                {
                    ll.removeLast();
                    root = root.left;
                }
            }
                             
        }
        
        Collections.reverse(ll);
        
        return ll;
    }
}