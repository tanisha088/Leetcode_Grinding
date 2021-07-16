/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    class Pair
    {
        Node root;
        int countno;
        
        Pair(Node root,int countno)
        {
            this.root=root;
            this.countno=countno;
        }
    }
    public List<Integer> preorder(Node root) {
        
        
                List<Integer> list=  new ArrayList<Integer>();

        if(root==null)
            return list;
        
        Stack<Pair> st = new Stack<Pair>();
        st.push(new Pair(root,0));
          list.add(st.peek().root.val);
  
        while(!st.isEmpty())
        {
            Pair top = st.peek();
            if(top.countno == top.root.children.size())
                st.pop();
            else 
            {
                Pair t1 = st.pop();
                t1.countno = t1.countno + 1;
                
                st.push(t1);
                st.push(new Pair(t1.root.children.get(t1.countno-1),0));
                list.add(st.peek().root.val);
            }
        }
        
        return list;
   
        /*
        List<Integer> l = new ArrayList<Integer>();
        pre(root,l);
        return l;
    }
    public void pre(Node root,List<Integer> l )
    {
        if(root==null)
            return;
        
        l.add(root.val);
        for(Node i:root.children)
        {
            pre(i,l);
        }
    }
    */
}
}