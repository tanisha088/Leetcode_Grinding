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
    public ListNode reverseKGroup(ListNode head, int k) {
        
        ListNode st = head;
        ListNode prev=null;
        while(st!=null)          
        {
            int i=1;
            ListNode s1 = st;
            ListNode s2 = st;
            
            while(s1!=null && i<k)
            {
                i++;
            s1=s1.next;
            }
             if(s1==null)
                 break;
            ListNode ta_last = s1.next;
            s1.next=null;
            if(prev!=null)
                prev.next=null;
            
          st = reverse(s2);
            
            if(prev==null)
            {
                head= st;
            }
            else      // st->3 , prev=1 , i=2 , s1 =2, s2=1 ,ta_last = 3 , s3 = 2 , head=2
            {
                prev.next = st;
            }
            i=1;
             while(i<k)
            {
                i++;
            st=st.next;
            }
            st.next=ta_last;
            
            prev= st;
            st=st.next;
        }
        
        return head;
    }
    
    public ListNode reverse(ListNode head)
    {
        if(head==null || head.next==null)
            return head;
        
        ListNode k = reverse(head.next);
        head.next.next=head;
        head.next=null;
        return k;
    }
}