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
    public ListNode detectCycle(ListNode head) {
        
        if(head==null || head.next==null)
            return null;
        
        ListNode fast =head.next.next;
        
        ListNode slow=head.next;
        while(slow!=fast)
        {
            if(fast==null || slow==null || fast.next==null)
                return null;
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println(fast.val+" "+slow.val);
        slow= head;
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        
        return slow;
    }
}