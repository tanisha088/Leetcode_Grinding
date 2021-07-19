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
      
        
        // CASE  I ::::::::
// ITERATIVE USING MORRIS FUNCTIONALITY/ ALGORITHM
        /*
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
        
        
        // CASE II :::  USING STACK ::: 
        
             Stack<TreeNode> st= new Stack<TreeNode>();
        
        st.push(root);
      
        if(root==null)
            return ll;
         ll.add(root.val);
        TreeNode curr =root.left;
        while(!st.isEmpty() || curr!=null)
        {

            while(curr!=null)
            {
               st.push(curr);
                ll.add(curr.val);
                curr=curr.left;
            }
            TreeNode n = st.pop();
            curr = n.right;
           
        }
        
        return ll;
        */
        
           while(root!=null)
        {
            
                 

            if(root.left==null)
            {
                                   ll.add(root.val);

                root=root.right;
            }
            else
            {
                TreeNode node =  root.left;
                while(node.right!=null && node.right!=root)
                  node=node.right;
                
                if(node.right==null)
                {
                           ll.add(root.val);

                    node.right =root;
                    root = root.left;
                }
                else
                {
                    root = root.right;
                   
                }
                
            }
        }
        return ll;
    }
}