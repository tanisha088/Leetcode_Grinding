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
        
        if(head==null || head.next==null)
            return head;
        return swap(null,head,head.next);
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