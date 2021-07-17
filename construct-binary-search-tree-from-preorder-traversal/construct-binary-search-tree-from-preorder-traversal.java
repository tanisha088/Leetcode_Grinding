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
    public TreeNode bstFromPreorder(int[] preorder) {
           
            int[] inorder =  new int[preorder.length];
        
        for(int i=0;i<preorder.length;i++)
            inorder[i]=preorder[i];
        
             Arrays.sort(inorder);
        HashMap<Integer,Integer>h = new HashMap();
   for(int i=0;i<inorder.length;i++)
   {
       h.put(inorder[i],i);
     }    
       return bst( preorder, inorder,0,preorder.length-1,0,inorder.length-1,h);
           
    }
    
    public TreeNode  bst(int[] preorder,int[] inorder,int ps,int pe,int ins,int ine,HashMap<Integer,Integer> h)
    {
      //  System.out.println(ps+" "+pe+" "+ins+" "+ine);
        
        if(ins>ine || ps>pe)
            return null;
        
        if(ins==ine || ps==pe)
            return new TreeNode(inorder[ins]);
        
        int el = preorder[ps];
        
        int ind = h.get(el);
 //System.out.println(ind+" "+el);
        TreeNode p1=  new TreeNode(el);
        
        p1.left = bst(preorder,inorder,ps+1,ps+ind-ins,ins,ind-1,h);
            p1.right = bst(preorder,inorder,ps+ind-ins+1,pe,ind+1,ine,h);
            
            return  p1;
    }
}

/*

8 5 1 7 10 12
1 5 7 8 10 12

0,5,0,5

el = 8 
ind = 3
left = (1,3,0,2) -> (2,2,0,0)[L] -> ()
right = (4,5,4,5) ->L (5,)
*/