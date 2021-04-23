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
        
        // RECURSIVE
        
        return reverseLists(null,head);
        
        
        /* ITERATIVE *
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