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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        /*
        ListNode h1=head;
        int c=0;
        while(c<n)
        {
            c=c+1;
            h1=h1.next;
        }
        if(h1==null)
            return head.next;
        ListNode k = head;
        while(h1.next!=null)
        {
            h1=h1.next;
            k=k.next;
        }
        
        k.next=k.next.next;
        return head;
        */
        
        ListNode h1 = head;
        ListNode ans = head;
        int k=0;
        while(k++<n-1)
            h1=h1.next;
        ListNode prev= null;
        while(h1.next!=null)
        {
            h1=h1.next;
            prev=head;
            head=head.next;
        }
        
        if(prev==null)
            return ans.next;
        if(head.next==null)
        {
            prev.next=null;
            return ans;
        }
        
        prev.next= prev.next.next;
        return ans;
    }
}