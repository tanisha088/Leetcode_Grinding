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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head==null)
            return null;
        
        ListNode next=  head;
        
        while(k!=0)
        {
            next= next.next;
            if(next==null)
                next=head;
            k--;
        }
        
       if(next==null)
           return head;
        
        ListNode m =  head;
        
        while(next.next!=null)
        {
            m=  m.next;
            next=next.next;
        }
        
        next.next = head;
        ListNode ans= m.next;
        m.next=null;
        
        return ans;
    }
}