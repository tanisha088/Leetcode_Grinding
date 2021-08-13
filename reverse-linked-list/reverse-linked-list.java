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
    public ListNode reverseList(ListNode head) {
        
        
     //   1ST SOLUTION ---> ITERATIVE
        
        /*
        if(head==null || head.next==null)
            return head;
        
        ListNode newHead =  reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
        */
        
            
    //        2ND SOLUTION -> RECURSIVEE
        /*
        // RECURSIVE
        //return reverseLists(null,head);
        
          if(head == null || head.next == null) return head;
        
        ListNode newHead = reverseList(head.next);
        
        System.out.println(head.val);
        head.next.next = head;
        head.next = null;

        return newHead;
        
        // ITERATIVE *
        if(head==null || head.next==null)
            return head;
        
        ListNode prev=null;
        ListNode curr=head;
        ListNode next=head.next;
        
        while(curr!=null)
        {
            curr.next=prev;
            prev=curr;
            if(next==null)
                break;
            curr=next;
            next=next.next;
        }
        
        return curr;
        */
            
            
       //     3RD SOLUTION-- -> 

        /*
          if(head==null || head.next==null)
              return head;
             ListNode dummy = new ListNode(0);
        dummy.next=head;
        head=dummy;
    
              ListNode preMiddle=dummy;
            ListNode preCurrent=dummy.next;
            while(preCurrent.next!=null){
            ListNode current = preCurrent.next;
                preCurrent.next=current.next; // ye phle kardia isse ek extra pointer lene se bach gaye
                 current.next=preMiddle.next;
                preMiddle.next=current;
               
            }
        
        return dummy.next;
        */
      //  return reverse1(head);
        
      
        
        return rev(head);
        
        
    }
    
    
    public ListNode rev(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
        
        ListNode retval =  rev(head.next);
        ListNode next =  head.next;
        head.next=null;
        next.next=head;
        
        return retval;
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
    
     public ListNode reverse1(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
         
         ListNode k = reverse(head.next);
         ListNode next = head.next;
         next.next = head;
         head.next =null;
         
         return k;
    }
    
    
    public ListNode reverseLists(ListNode prev,ListNode curr)
    {
        if(curr==null)
            return prev;
        
        ListNode m = curr.next;
        curr.next= prev;
        prev=curr;
        curr=m;
        
        return reverseLists(prev,curr);
    }
}