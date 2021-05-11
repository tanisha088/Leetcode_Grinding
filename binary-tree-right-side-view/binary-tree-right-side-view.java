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
    
    int max=0;
    public List<Integer> rightSideView(TreeNode root) {
        
      
        LinkedList<Integer> ans = new LinkedList<Integer>();
        LinkedList<TreeNode> ll= new LinkedList<TreeNode>();
        
   //     APPROACH 1 ::: The first wahi purani wali approach jisme 2 linked list mei add karo - ek value wali aur ek node wali - value wali mei level ki value hogi ki kaunsa level hai - and node mei ye ki kaunsa node hai 
        
        /*
        LinkedList<Integer> val = new LinkedList<Integer>();
   
        ll.add(root);
        val.add(0);
     
        if(root==null)
            return ans;
         int rv=-1;
        while(!ll.isEmpty())
        {
            TreeNode m= ll.remove();
            int v = val.remove();
            
            if(val.isEmpty())
                ans.add(m.val);

            if(!val.isEmpty())
           {
                int k1 =val.removeFirst();
              if(k1!=v)
              {
               ans.add(m.val);
              }
              val.addFirst(k1);

           }
          
            if(m.left!=null)
            {
                ll.add(m.left);
                val.add(v+1);
            }
            if(m.right!=null)
            {
                ll.add(m.right);
                val.add(v+1);
            }
        }
        */
        
        
    // NOW THE 2ND APPROACH , JISME HUM YE TAB TAK KARENGE TILL PURA QUEUE KHALLI NHI HO JAATA -- SO EVERY TIME FOR EVERY CURRENT QUEUE SIZE -- HUM ANDAR WALA LOOP RUN KARENGE TILL EK LEVEL KE SAARE ELEMENTS TRAVERSE NA HO JAAYE ---->
        
        /*
        ll.add(root);
        
        TreeNode nodes = root;
        
        if(nodes==null)
            return ans;
        // FOR THE WHOLE TREE-- TILL LL IS NOT EMPTY
        while(!ll.isEmpty())
        {
            int size = ll.size();
            
            // IS TIME PE IS LL MEI SIRF EK HI LEVEL KE SAARE ELEMENTS HONGE AND THUS , HUM UN SABKO ITERATE KAR DENGE AND UNKE CORRESPONDING CHILD DAAL DENGE 
            
    // NOW IN CASE OF RIGHT SIDE VIEW-- HAR LEVEL KA LAST ELEMENT PRINT KARNA HOGA -- AND SO -- JO HIS LOOP MEI LAST MEI REMOVE HUA HOGA ....WO HOGA RIGHTMOST
            
            nodes = null;
            while(size!=0)
            {
                TreeNode m = ll.remove();
                nodes=m;
                if(m.left!=null)
                    ll.add(m.left);
                if(m.right!=null)
                    ll.add(m.right);
                
                size--;
            }
            
            ans.add(nodes.val);
        }
        */
        
        rightview(root,0,ans);
        return ans;
        
    }
    
    public void rightview(TreeNode root,int le,LinkedList<Integer> ans)
    {
        if(root==null)
            return;
        
        if(le==max)
        {
            ans.add(root.val);
            
            max++;
        }
        
        rightview(root.right,le+1,ans);
        rightview(root.left,le+1,ans);
    }
}