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
    public ListNode insertionSortList(ListNode head) {
        
        ListNode h1 = head;
        int num = 0;
        
        while(h1!=null)
        {
            h1 = h1.next;
            num++;
        }
        num-=2;
        while(num>=0)
        {
            int k = num;
            ListNode h2 = head;
            while(k-->0)
            {
                h2 = h2.next;
            }
            
            ListNode k1 = h2.next;
            while(k1!=null && k1.val<=h2.val)
            {
                int t = k1.val;
                k1.val = h2.val;
                h2.val = t;
                
                k1 = k1.next;
                h2 = h2.next;
            }
            
            num--;
            
        }
        
        
        return head;
        
    }
}





