/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//         ListNode st= new ListNode(0);
//         ListNode tail = st;
        
//         return mergeTwoLists(l1,l2,st,tail);
        
        return fn(l1,l2);
    }
    
   
    public ListNode fn(ListNode l1,ListNode l2)
    {
        if(l1==null || l2==null)
        {
         return l1==null?l2:l1;   
        }
        
        ListNode a1 = l1;
        ListNode a2 = l2;
       ListNode p1 = null;
        ListNode p2 = null;
        ListNode h = null;
        while(a1!=null && a2!=null)
        {
            if(a1.val<a2.val)
            {
                if(h==null)
                    h=a1;
                                ListNode k1 =  a1.next;

                if(p2!=null)
                    p2.next =a1;
                 
                p2=a1;
                a1.next = a2;
              
                a1=k1;
                p1=null;
               
            }
            else
            {
                
                if(h==null)
                    h=a2;
                
                ListNode k1 =  a2.next;
                if(p1!=null)
                    p1.next =a2;
                 
                p1=a2;
                a2.next = a1;
                a2=k1;
                p2=null;
            }
        }
        
        return h;
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//     public ListNode mergeTwoLists(ListNode l1,ListNode l2, ListNode st,ListNode tail)
//     {
//         if(l1==null && l2==null)
//             return st.next;
//         int val=-1;
//         if(l1==null || l1.val>l2.val)
//         {
//             val=l2.val;
//             l2=l2.next;
//         }
//         else if(l2==null || l2.val<=l1.val)
//         {
//              val=l1.val;
//             l1=l1.next;
//         }         
        
          
//     }
}