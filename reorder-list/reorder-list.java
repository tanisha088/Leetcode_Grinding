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
        
    /////  --->>>>
        
        // 1. find the mid 2. reverse the after mid 3. find mid and form the new LL
        
        ListNode slow=head;
        ListNode fast=head;
        ListNode slprev=null;
        int size=0;
        while(slow!=null && fast!=null)
        {
            slprev=slow;
                 //       System.out.println(slow.val+" "+fast.val);

            slow=slow.next;
            if(fast.next==null)
                break;
            fast=fast.next.next;
            size+=1;
        }
    // System.out.println(slow.val);
         ListNode krev =  reverse(slow);
//   System.out.println(krev.val+" "+krev.next.val);
        
         slprev.next= null;
        
    
//       1->2->4->3   p1=1 p2=4  k1=2,k2=3   1->4->2  4,2    
           
        ListNode p1 = head;
        ListNode p2 = krev;
        Merge(p1,p2);
 //  System.out.println(p1.next.next+" "+p2.next.next);
        /*
        while(p1!=null && p2!=null)
        {
/*
            ListNode k2 = p2.next;
            
         //   if(k2==null)
           //     break;
            
            ListNode k1 = p1.next;
         //   System.out.println(k1.val+" "+k2.val);
            p2.next=p1.next;
            
         //   k1.next=k2;
             p1.next=p2;
          
            p2=k2;
             p1=k1;
         
            
         //    ListNode next = p1.next;
         //   p1.next = p2;
         //   p1 = p2;
          //  p2 = next;
        }
    //  System.out.println(p1.val+" "+p2.val);
      //  p1.next=p2;
      //  if(size%2!=0)
        //    p2.next=null;
       // else
         //   p1.next=null;
            
        */
        
            // System.out.println(p1.val+" "+p2.val); 
//p2.next=null;
        
    }
     public ListNode Merge(ListNode head1, ListNode head2)
    {
        ListNode curr1 = head1;
        ListNode curr2 = head2;
        
        while (curr1 != null && curr2 != null)
        {
            ListNode next1 = curr1.next;
            ListNode next2 = curr2.next;
            
            curr1.next = curr2;
            curr2.next = next1;
            
            curr1 = next1;
            curr2 = next2;
        }
        
        return head1;
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

