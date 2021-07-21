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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        
        if(root==null)
            return false;
        
        
        if(root.val == subRoot.val && isequal(root,subRoot)==true)
          return true;
        
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
           
    }
    
    public boolean isequal(TreeNode r1,TreeNode r2)
    {
        if(r1==null && r2==null)
            return true;
        
        if(r1==null || r2==null)
            return false;
        
        if(r1.val!=r2.val)
            return false;
        
        return isequal(r1.left,r2.left) && isequal(r1.right,r2.right);
    }
        
        /*
       if(root==null)
            return false;

        if(root.val==subRoot.val)
        {
            if(isequal(root,subRoot)) // NO NEED TO EVEN CHECK FOR THIS SINCE AGAR DIRECT BHI IS EQUAL CALL KIYA TO WO FIRST CALL MEI HI SAME NA HONE PE RETURN FALSE KAR DEGA
                // ONE MORE THING KI AGAR WO ISEQUAL KA RESULT FALSE DE TO RETURN FALSE NHI KARNA .. THIS IS BECAUSE AISA HO SKTA HAI KI HUME DONO KA ROOT EQUAL MIL JAAYE BUT ANDAR KA SUBTREE DIFF HO BUT USKE KOI CHILD MEI SAME SUBTREE PRESENT HO .. SO AGAR TRUE MILTA HAI TO TRUE RETURN .. ELSE NEECHE MEI CHECK KARO
                return true;
        }
        
        
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }
  
    public boolean isequal(TreeNode a,TreeNode b)
    {
        if(a==null && b==null)
            return true;
        
        if(a==null || b==null)
            return false;
        
        if(a.val==b.val && (isequal(a.left,b.left) && isequal(a.right,b.right)))
            return true;
        
        return false;
            
    }
    
    */
}