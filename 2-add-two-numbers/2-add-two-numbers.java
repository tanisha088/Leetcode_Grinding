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
 
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry = 0;
        ListNode prev= null;
        ListNode ans = l1;
        
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        
            while(l1!=null && l2!=null)
            {
           
                int sum =  l1.val + l2.val + carry;
                carry = sum/10;
                sum = sum%10;
                l1.val =  sum;
                
                prev= l1;
                l1 = l1.next;
                l2 = l2.next;
            }
        
            if(l2!=null)
            {
                prev.next=l2;
                prev=prev.next;
                l1 = prev;
            }
        
           while(l1!=null)
           {
               int sum =  l1.val + carry ;
               carry = sum/10;
               sum = sum%10;
               l1.val = sum;
               prev = l1;
               l1= l1.next;
           }
        
           if(carry!=0)
               prev.next = new ListNode(carry);
        
           
           return  ans;
        
    }
    
}