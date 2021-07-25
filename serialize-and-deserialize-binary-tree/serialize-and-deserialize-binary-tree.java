/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

    String serial = "";
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
       serial = "";
        pre(root);

       return serial;
    }
    
    public void pre(TreeNode root)
    {
        if(root==null)
        {
            serial=serial+"#"+",";
            return;
        }
                serial = serial  +  root.val +",";
        pre(root.left);
        pre(root.right);
    }

    int i=0;
    // Decodes your encoded data to tree.
    
    public TreeNode cons(String[] sarr,int lim)
    {
        if(i>=lim)
            return null;
        
        if(sarr[i].equals("#"))
        {
      //      System.out.println(sarr[i]);
            return null;
        }
        TreeNode t = new TreeNode(Integer.parseInt(sarr[i]));
   //     System.out.println(sarr[i]);
        i++;
        t.left = cons(sarr,lim);
         i++;
        t.right = cons(sarr,lim);
        

        return t;
    }
    
    public TreeNode deserialize(String data) {
        String[] sarr =  data.split(",");
       i=0;
      
        
        
    TreeNode k = cons(sarr,sarr.length);
            
return k;
    }
    
    public void pres(TreeNode k)
    {
        if(k==null)
            return;
        
   
        pres(k.left);
             System.out.println(k.val);
        pres(k.right);
    }
}



// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));