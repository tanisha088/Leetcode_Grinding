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
class BSTIterator {

    TreeNode curr;
    TreeNode ans;
    Stack<TreeNode> st;
    public BSTIterator(TreeNode root) {
        curr = root;
        ans= null;
        st = new Stack();
    }
    
    public int next() {
     
        while(curr!=null)
        {
            st.push(curr);
            curr=curr.left;
        }
        
        ans=  st.pop();
         curr = ans.right;
        return ans.val;
       
        
    }
    
    public boolean hasNext() {
        
        return !(curr==null &&  st.isEmpty());
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */