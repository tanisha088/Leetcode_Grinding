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
    }
}