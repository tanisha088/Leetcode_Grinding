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

    String str = "";
    TreeNode head;
    int i;
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
       
        pre(root);
        return str;
       
    }
    
    public void pre(TreeNode root)
    {
        if(root==null)
        {
            str = str +"# ";
            return;
        }
        str = str + root.val +" ";
        
        pre(root.left);
        pre(root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        
        head = null;
        i=0;
        String[] string =  data.split("\\s+");
        fn(string);
        
        return head;
    }
    
    public TreeNode fn(String[] data)
    {
        if(i==data.length)
             return null;
        
        if(data[i].equals("#"))
             return null;
        
        TreeNode node = new TreeNode(Integer.parseInt(data[i]));
        if(head==null)
            head=node;
        i++;
        
        node.left =  fn(data);
        
        i++;
        node.right = fn(data);
        
        return node;
    }
        
}

// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));