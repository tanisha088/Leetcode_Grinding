/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        int rv=-1;
        LinkedList<Node> ll= new LinkedList<Node>();
        LinkedList<Integer> val = new LinkedList<Integer>();
        if(root==null)
            return null;
        ll.add(root);
        val.add(0);
        Node prev=null;
        Node curr=null;
        while(!ll.isEmpty())
        {
            Node m= ll.remove();
            int v = val.remove();
            curr=m;
              
             if(rv==v)
             {
                    prev.next=curr;
                 prev=curr;
             }
                else
                {
                    prev = curr;
                    rv++;
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
        
        return root;
    }
}