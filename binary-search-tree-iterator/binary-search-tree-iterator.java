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

    TreeNode rootnode = null;
    TreeNode innode= null;
    
    public BSTIterator(TreeNode root) {
        
        rootnode = root;
    }
    
    public int next() {
        
        TreeNode r1 =  rootnode;
        
        if(innode==null)
        {
            while(r1.left!=null)
                r1=r1.left;
        
            innode = r1;
        return r1.val;
        }
        int val = innode.val;
        TreeNode node = null;
        while(r1!=null)
        {
            if(r1.val > val)
            {
                node = r1;
                r1=r1.left;
            }
            else
                r1=r1.right;
        }
        
        innode =  node;
        return node.val;
    }
    
    public boolean hasNext() {
        
      TreeNode r1 =  rootnode;

        if(innode==null)
        {
            return rootnode!=null;
        }
        
        int val = innode.val;
        TreeNode node = null;
        while(r1!=null)
        {
            if(r1.val > val)
            {
                node = r1;
                r1=r1.left;
            }
            else
                r1=r1.right;
        }
        
        
        return node!=null;
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */