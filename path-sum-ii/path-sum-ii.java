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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        List<Integer> res=  new ArrayList<Integer>();
        
        fn(root,targetSum,0,res,list);
        return list;
    }
    
   public void fn(TreeNode root,int target,int sum,List<Integer> res,List<List<Integer>> ans)
    {
          if(root==null)
              return;
       
           res.add(root.val);
          sum= sum +  root.val;
       
  ///     System.out.println(ans+" "+res);
       if(root.left==null && root.right==null && target==sum)
       {
           
          ans.add(new ArrayList(res));
       }
       fn(root.left,target,sum,res,ans);
       fn(root.right,target,sum,res,ans);
             
       res.remove(res.size()-1);
    }
}