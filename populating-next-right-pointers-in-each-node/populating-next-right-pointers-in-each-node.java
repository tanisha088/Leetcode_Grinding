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
        
        
//         /// 1ST APPROACH ==> O(1) SPACE AND O(N) MEMORY
//      // Here we are taking two pointers, one which will be used for traversal in the vertical order i.e. from one level to other and the other one will be used for traversal of each of the levels and thus firstly for every node we check if it is null or not and if is not then ---> for all the nodes in that level-> if that node has left!=null -> then link the left and right nodes -> and if that node has next!=null and if node.next.left!=null then node.right.next= node.next.left and then go to the next node i.e. next node on same level and then continue the same for it till this node is null.... after that go to the next level using node=node.left
        
// // BUT THIS APPROACH WOULD ONLY WORK FOR COMPLETE AND PERFECT BINARY TREES I.E. IN WHICH ATLEAST ONE CONDITION IS THAT THE NODES MUST BE AS LEFT AS POSSIBLE WHEREAS THE BELOW APPROACH WOULD WORK ON ANY OF THE TREES 
//         Node  node = root;
//         Node k = node;
//         while(k!=null)
//         {
//              k = node;
//             while(node!=null)
//             {
//                 if(node.left!=null)
//                 node.left.next = node.right;
//                 if(node.left!=null && node.next!=null)
//                     node.right.next=node.next.left;
                
//                 node=node.next;
//             }
            
//             if(k!=null)
//             node=k.left;
//         }
        
//         return root;
        
//         /*
        
//         ///  2ND APPROACH ==> O(N) MEMORY AND O(N) SPACE
//         int rv=-1;
//         LinkedList<Node> ll= new LinkedList<Node>();
//         LinkedList<Integer> val = new LinkedList<Integer>();
//         if(root==null)
//             return null;
//         ll.add(root);
//         val.add(0);
//         Node prev=null;
//         Node curr=null;
//         while(!ll.isEmpty())
//         {
//             Node m= ll.remove();
//             int v = val.remove();
//             curr=m;
              
//              if(rv==v)
//              {
//                     prev.next=curr;
//                  prev=curr;
//              }
//                 else
//                 {
//                     prev = curr;
//                     rv++;
//                 }
            
//             if(m.left!=null)
//             {
//                 ll.add(m.left);
//                 val.add(v+1);
//             }
//             if(m.right!=null)
//             {
//                 ll.add(m.right);
//                 val.add(v+1);
//             }
//         }
        
//         return root;
//         */
        
        if(root==null)
            return null;
        
        Node m  = root.left;
        
        if(m==null)
            return root;
        
        root.left.next = root.right;
        
        if(root.next!=null)
            root.right.next=root.next.left;
        
        
        connect(root.left);
        connect(root.right);
        
        return root;
    }
}