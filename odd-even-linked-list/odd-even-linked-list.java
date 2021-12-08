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
    public ListNode oddEvenList(ListNode head) {
        
        ListNode odd = null;
        ListNode even = null;
        ListNode lasto = null;
        ListNode laste = null;
        int i=1;
        
        while(head!=null)
        {
            if(i%2==0)
            {
                if(even==null)
                {
                    even=head;
                    laste =  even;
                }
                else
                {
                    laste.next=head;
                    laste=laste.next;
                }
            }
            else
            {
                 if(odd==null)
                {
                    odd=head;
                    lasto =  odd;
                }
                else
                {
                    lasto.next=head;
                    lasto=lasto.next;
                }
            }
            i++;
            head= head.next;
        }
        
        if(odd==null)
            return even;
        else if(even==null)
            return odd;
        else
        {
            lasto.next=even;
            laste.next=null;
            return odd;
        }
    }
}