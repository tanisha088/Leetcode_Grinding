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
    public ListNode sortList(ListNode head) {
        
        return mergesort(head);
    }
    
    public ListNode mergesort(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
        ListNode mid  = find(head);
        ListNode next = mid.next;
        mid.next = null;
       // System.out.println(head.val+" "+head.next);
        // System.out.println(next.val+" "+next.next);
        head = mergesort(head);
        next = mergesort(next);
        ListNode h =  merge(head,next);
        
        return h;
    }
    
    public ListNode find(ListNode head)
    {
        ListNode slow = head;
        ListNode fast  = head;
        ListNode prev= null;
        while(fast!=null && fast.next!=null)
        {
            prev = slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        
        return prev;
    }
    
    public ListNode merge(ListNode h1,ListNode h2)
    {
        ListNode newhead = null;
        ListNode prev = null;
        
        if(h1==null)
            return h2;
        if(h2==null)
            return h1;
        
        while(h1!=null && h2!=null)
        {
            if(h1.val<=h2.val)
            {
                if(newhead==null)
                {
                    newhead = h1;
                   prev = h1;
                }
                else
                {
                    prev.next=h1;
                    prev=prev.next;
                }
            
                h1=h1.next;

            }
            else
            {
                   if(newhead==null)
                {
                    newhead = h2;
                   prev = h2;
                }
                else
                {
                    prev.next=h2;
                    prev=prev.next;
                    
                }
                h2= h2.next;
            }
        }
        
        if(h1!=null)
        {
            prev.next= h1;
        }
        else if(h2!=null)
            prev.next= h2;
        
        
        
        
        return newhead;
    }
}



// 3-4
// 5-6

//1-2-3