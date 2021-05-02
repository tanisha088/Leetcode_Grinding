/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
     TreeNode res=null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        	inorder(root,p.val,q.val);
		
		return res;
	}
	
	void inorder(TreeNode root,int n1,int n2)
	{
	    if(root==null)
	    return;
	    
	    inorder(root.left,n1,n2);
	    inorder(root.right,n1,n2);
	    if(root.val==n1 || root.val==n2 || (search(root.left,n1) && search(root.right,n2)) || (search(root.left,n2) && search(root.right,n1)))
	       res=root;
	}
	
	boolean search(TreeNode root,int n1)
	{
	 if(root==null)
	 return false;
	 
	 if(root.val==n1)
	 return true;
	 
	return search(root.left,n1) || search(root.right,n1);
	}
    
}