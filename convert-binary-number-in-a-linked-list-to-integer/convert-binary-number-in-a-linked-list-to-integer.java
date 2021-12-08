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
    int pow=0;
    public int getDecimalValue(ListNode head) {
        
        if(head==null)
            return 0;
        
        int val = getDecimalValue(head.next);
        if(head.val==1)
        {
            val = val | 1<<pow;
        }
        
        pow++;
        
        return val;
    }
}

