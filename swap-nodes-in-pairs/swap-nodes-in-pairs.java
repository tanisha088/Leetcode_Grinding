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
    public ListNode swapPairs(ListNode head) {
        
//         if(head==null || head.next==null)
//         return head;
//         ListNode dummy = new ListNode(0);
//         dummy.next=head;
//         head=dummy;
       
        
//         fn(dummy);
//         return dummy.next;
//     }
    
//     public void fn(ListNode head)
//     {
//         if(head==null || head.next==null || head.next.next==null)
//             return;
            
//         ListNode a = head.next;
//         ListNode b=  a.next;
//         ListNode c = b.next;
        
//         head.next=b;
//         b.next=a;
//         a.next=c;
        
//         fn(head.next.next);
//     }
        
        // if(head==null || head.next==null)
        //     return head;
        // return swap(null,head,head.next);
        
        if(head==null || head.next==null)
            return head;
        
        ListNode p1 = null;
        ListNode p2 = head;
        
        
        
        ListNode c1 = p2;
        ListNode c2 = c1.next;
        
        while(p2!=null && p2.next!=null)
        {
          
            c1 = p2;
           c2 = c1.next;
         //   if(c1==null || c1.next==null)
           //     return head;
           //   System.out.println((c1==null?"-1":c1.val)+"  "+ (c2==null?"-1":c2.val) + " **");
            p2.next = c2.next;
            c2.next= c1;
            if(p1==null)
            {
                head=c2;
               
            }
            else
               { p1.next=c2;}
          
       //     System.out.println(c1.val+" "+c2.val+" "+head.val+" "+);
            p1=c1;
            p2=p2.next;
            
           
        }
        
        return head;
        
        
    }
    
    public ListNode swap(ListNode pre,ListNode head,ListNode next)
    {
        if(head.next==null)
            return head;
        
         head.next=  next.next;
        next.next = head;
        if(pre!=null)
            pre.next= next;
        
        if(head.next!=null)
        swap(head,head.next,head.next.next);
        
        return next;
    }
}













// 1->2->3->4 
    
    
// p1 p2    