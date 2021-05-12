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

class Pair
{
    int a ;
    int b;
    Pair(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    
   
}
     public class Paircomparator implements Comparator<Pair> {
 
    public int compare(Pair p1,Pair p2) {
        
        if(p1.b==p2.b)
            return p1.a-p2.a;
        else
            return p1.b-p2.b;
    }
}

class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        HashMap<Integer,List<Pair>> h = new HashMap<Integer,List<Pair>>();
        
        LinkedList<TreeNode> ll= new LinkedList<TreeNode>();
        LinkedList<Integer> cols= new LinkedList<Integer>();
       
        List<List<Integer>> ams= new ArrayList<List<Integer>>();
        
        ll.add(root);
        cols.add(0);
        int min=Integer.MAX_VALUE;
        int max=0;
        int lev=0;
        while(!ll.isEmpty())
        {
            int size= ll.size();
            lev++;
            while(size!=0)
            {
                TreeNode m = ll.remove();
                int co = cols.remove();
                List<Pair> list = h.getOrDefault(co,new ArrayList<Pair>());
                Pair p= new Pair(m.val,lev);
                list.add(p);
                h.put(co,list);
                min=Math.min(co,min);
                max=Math.max(co,max);
                if(m.left!=null)
                {
                    ll.add(m.left);
                    cols.add(co-1);
                }
                if(m.right!=null)
                {
                    ll.add(m.right);
                    cols.add(co+1);
                }
                
                size--;
            }
        }
        
   
        
        for(int i=min;i<=max;i++)
        {
            List<Pair> list = h.get(i);
            Collections.sort(list, new Paircomparator());
            
            List<Integer> ltbi = new ArrayList<Integer>();   
            for(int j=0;j<list.size();j++)
                ltbi.add(list.get(j).a);
            
            ams.add(ltbi);
        }
        
        return ams;
    }
}