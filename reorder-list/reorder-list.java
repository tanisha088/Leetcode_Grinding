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
    public void reorderList(ListNode head) {
        
//     /////  --->>>>
        
//         // 1. find the mid 2. reverse the after mid 3. find mid and form the new LL
        
//         ListNode slow=head;
//         ListNode fast=head;
//         ListNode slprev=null;
//         int size=0;
//         while(slow!=null && fast!=null)
//         {
//             slprev=slow;
           
//             slow=slow.next;
//             if(fast.next==null)
//                 break;
//             fast=fast.next.next;
//             size+=1;
//         }
 
//          ListNode krev =  reverse(slow);
 
        
//          slprev.next= null;
        
    

//         ListNode p1 = head;
//         ListNode p2 = krev;
//       //  Merge(p1,p2);
//  //System.out.println(p1.val+" "+p2.next.val);
        
//         while(p2!=null)
//         {

//             ListNode k2 = p2.next;
           
//             ListNode k1 = p1.next;
//          //   System.out.println(k1.val+" "+k2.val);
//             p2.next=k1;
            
//          //   k1.next=k2;
//              p1.next=p2;
          
//             p2=k2;
//              p1=k1;
         
//             /*other approach*/
//          //    ListNode next = p1.next;
//          //   p1.next = p2;
//          //   p1 = p2;
//           //  p2 = next;
//         }
//     //  System.out.println(p1.val+" "+p2.val);         
//       //  p1.next=p2;
//       //  if(size%2!=0)
//         //    p2.next=null;
//        // else
//          //   p1.next=null;
            
        
        
//             // System.out.println(p1.val+" "+p2.val); 
// //p2.next=null;
        
//     }
//      public ListNode Merge(ListNode head1, ListNode head2)
//     {
//         ListNode curr1 = head1;
//         ListNode curr2 = head2;
        
//         while (curr1 != null && curr2 != null)
//         {
//             ListNode next1 = curr1.next;
//             ListNode next2 = curr2.next;
            
//             curr1.next = curr2;
//             curr2.next = next1;
            
//             curr1 = next1;
//             curr2 = next2;
//         }
        
//         return head1;
//     }

//     public ListNode reverse(ListNode head)
//     {
//        if(head==null || head.next==null)
//            return head;
        
//         ListNode k1 = reverse(head.next);
//         ListNode nnode = head.next;
//         nnode.next=head;
//         head.next=null;
//         return k1;
           
//     }
    if(head==null || head.next==null)
        return;
        ListNode slow  =head;
        ListNode fast = head;
        
        ListNode prev=null;
        int c=0;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
            c=c+1;
        }
        
        prev.next = null;
        prev.next  = reverse(slow);
        slow = prev.next;
        ListNode h2 = prev.next;
        ListNode h1 = head; 
        while(true)
        {
            ListNode nxh2 = h2.next;
            ListNode nxh1 = h1.next;
        //    System.out.println(nxh1.val+" "+nxh2.val+" "+h1.val+" "+h2.val);
            h1.next=  h2;
            if(c>1)
            h2.next= nxh1;
            else
                break;
            
            h1 = nxh1;
            h2= nxh2; 
            c--;
        }
        
    }
    
      public ListNode reverse(ListNode head)
    {
       if(head==null || head.next==null)
           return head;
        
        ListNode k1 = reverse(head.next);
        ListNode nnode = head.next;
        nnode.next=head;
        head.next=null;
        return k1;
           
    }
}


//  1 2 3 4 5 6 7
//  1 7 2 6 3 5 4

