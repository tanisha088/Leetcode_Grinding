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
    public List<Integer> preorderTraversal(TreeNode root) {
          
        LinkedList<Integer> ll = new LinkedList<Integer>();
        
        while(root!=null)
        {
            
                    ll.add(root.val);

            if(root.left==null)
            {
                root=root.right;
            }
            else
            {
                TreeNode node =  root.left;
                while(node.right!=null && node.right!=root)
                  node=node.right;
                
                if(node.right==null)
                {
                    node.right =root;
                    root = root.left;
                }
                else
                {
                    ll.removeLast();
                    root = root.right;
                   
                }
                
            }
        }
        
        return ll;
    }
}