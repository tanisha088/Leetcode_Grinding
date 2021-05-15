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
    public int[] findFrequentTreeSum(TreeNode root) {
        
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        
        int[] max= new int[1];
        max[0]=Integer.MIN_VALUE;
        fn(root,h,max);
                
        ArrayList<Integer> list= new ArrayList<Integer>();
        for(Map.Entry<Integer,Integer> e:h.entrySet())
        {
            if(e.getValue()==max[0])
            {
                list.add(e.getKey());
            }
        }
        
        int[] arr= new int[list.size()];
        
        for(int j=0;j<arr.length;j++)
            arr[j]=list.get(j);
        
        return arr;
    }
    
    public int fn(TreeNode root,HashMap<Integer,Integer> h,int[] max)
    {
        if(root==null)
            return 0;
        
        int l = fn(root.left,h,max);
        int r = fn(root.right,h,max);
        
        int ss =  l+r+root.val;
        int k = h.getOrDefault(ss,0)+1;
        max[0]=Math.max(max[0],k);
        h.put(ss,k);
        
        return ss;
    }
}