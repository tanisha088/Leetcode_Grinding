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
    }
}