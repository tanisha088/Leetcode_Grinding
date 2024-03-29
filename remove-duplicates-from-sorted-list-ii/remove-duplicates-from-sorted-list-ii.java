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
    public ListNode deleteDuplicates(ListNode head) {
        
        if(head==null)
            return head;
        
        ListNode prev=null;
        ListNode m = head;
        
        while(m!=null)
        {
            int v1=  m.val;
            if(m.next==null || m.next.val!=v1)
            {
                prev=m;
                m=m.next;
                continue;
            }
            while(m!=null && m.val==v1)
                m=m.next;
            
            if(prev==null)
                head=m;
            else
                prev.next=m;
        }
        
        return head;
        
        // if(head==null)
        //     return null;
        // return del(head,head,null,head.val-1);
        /*
        if(head==null || head.next==null)
            return head;
        
        int val= head.val-1;
        
        ListNode prev=null;
        ListNode node = head;
        
        while(node!=null)
        {
            if((val!=node.val && node.next!=null && node.next.val == node.val) || val==node.val)
            {       
                if(prev==null)
                        head=head.next;
                    else
                    prev.next=node.next;
                
                val = node.val;
            }
            else
            {
                if(prev==null)
                    prev=head;
                else
                prev=prev.next;
            }
            
               node=node.next;
        }
        
        return head;
 
        // prev -> null    
        // node -> 1  
        // val = 1
        */
    }
    
    public ListNode del(ListNode head,ListNode node,ListNode prev,int val)
    {
        if(node==null)
            return head;
        
        if(node.val==val || (node.next!=null && node.next.val==node.val))
        {
            if(prev==null)
                head=head.next;
            else
                prev.next=node.next;
        
        }
        else
        {
            prev = (prev==null)?head:prev.next;
        }
        
        return del(head,node.next,prev,node.val);
    }
}