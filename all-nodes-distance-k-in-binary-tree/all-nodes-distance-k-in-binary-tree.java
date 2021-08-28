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
    
           HashMap<Integer,ArrayList<Integer>> h = new HashMap();
     
   List<Integer> res=  new ArrayList<Integer>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
      
        if(k==0)
        {
            res.add(target.val);
            return res;
        }
        
                 fn(root,target,k);
        
        return res;
    }
   int fn(TreeNode node,TreeNode targ,int k)
   {
       if(node==null)
           return 0;
       
 //      if(k<=0)
   //        return 0;
       
       if(node.val==targ.val)
       {
           
           bfs(node.left,targ,k-1);
           bfs(node.right,targ,k-1);
           
           return 1;
       }
       
       int k1  = fn(node.left,targ,k);
       
       if(k1>=1)
       {
           if(k1==k)
           res.add(node.val);
           bfs(node.right,targ,k-k1-1);
           
           return k1+1;
       }
       
       k1= fn(node.right,targ,k);
       
       if(k1>=1)
       {
           if(k1==k)
           res.add(node.val);
           bfs(node.left,targ,k-k1-1);
           
           return k1+1;
       }
       
       return -1;
   }  
 
    public void bfs(TreeNode root,TreeNode target,int lev)
    {
        if(root==null)
            return;
        
        if(lev==0)
        {
            res.add(root.val);
        }
       
        bfs(root.left,target,lev-1);
        bfs(root.right,target,lev-1);
    }
}


/*


level order for down wali 





*/