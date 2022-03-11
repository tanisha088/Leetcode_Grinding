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
        
        int size  = 0;
        ListNode h = head;
        ListNode prev = null;
        
        
        while(h!=null)
        {
            prev = h;
            h=h.next;
            size++;
        }
        if(size==0)
            return head;
        k = k%size;
        
        k=size-k-1;
        h = head;
        while(k>0)
        {
            h = h.next;
            k--;
        }
        
        if(h.next==null)
            return head;
        
        ListNode next = h.next;
        h.next=null;
        prev.next = head;
        
        return next;
        
    }
}