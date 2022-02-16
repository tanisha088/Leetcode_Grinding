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
    public ListNode swapPairs(ListNode head) {
 
        ListNode k =  new ListNode(0);
        k.next = head;
        ListNode h1= head;
        ListNode prev = k;
        
        while(h1!=null)
        {
           ListNode h2= h1.next;
            if(h2==null)
                break;
           ListNode next = h2.next;
           
            prev.next = h2;
            h2.next = h1;
            h1.next = next;
            prev = h1;
            h1 = h1.next;
            
        }
        
        return k.next;
    }
}

