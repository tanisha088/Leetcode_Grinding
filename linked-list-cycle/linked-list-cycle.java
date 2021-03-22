/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
            if(head==null || head.next==null)
            return false;
        
        ListNode fast =head.next.next;
        
        ListNode slow=head.next;
        while(slow!=fast)
        {
            if(fast==null || slow==null || fast.next==null)
                return false;
            fast=fast.next.next;
            slow=slow.next;
        }
        
        return true;
    }
}