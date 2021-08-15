/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        
        if(head==null)
            return null;
        
        Node m = head;
        while(m!=null)
        {
            Node node = new Node(m.val);
            node.next=m.next;
            m.next=node;
            m= m.next.next;
        }
        
        m = head;
        while(m!=null)
        {
            if(m.random!=null)
            m.next.random = m.random.next;
            m=m.next.next;
        }
        
        m = head;
        Node res=null;
        Node end=null;
      
        while(m!=null)
        {
            Node k1 = m.next.next;
            if(res==null)
            {
                res=m.next;
                end=res;
            }
            else
            {
                end.next=m.next;
                end=end.next;
            }
            m.next=k1;
            
            m=m.next;
        }
        
        return res;
            
//         7 7 13-13
//             m=7
//             res=7  end=7
        
        
    }
}