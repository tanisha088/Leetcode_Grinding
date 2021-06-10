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
    public ListNode swapNodes(ListNode head, int k) {
        
        int c=0;
        ListNode h = head;
        ListNode n1 =head;
        while(c<k)
        {
            if(c==k-1)
                break;
            
            h=h.next;
            n1=n1.next;
            c++;
        }
        
      ListNode k1 = head;
        while(h.next!=null)
        {
            k1=k1.next;
            h=h.next;
            
        }
        
        int a = k1.val;
        k1.val = n1.val;
        n1.val = a;
        
        return head;
        
        /*
        ListNode h = head;
        int size=0;
        while(h!=null)
        {
            h=h.next;
            size++;
        }
        
        int first = k;
        int sec = size-k+1;
        if(first>size || sec>size || first==sec)
            return head;
        
        ListNode m = head;
        int val1=0;
        int val2=0;
        int c1=first;
        int c2=sec;
      while(m!=null)
      {
          if(c1==1)
          {
              val1=m.val;
          }
          if(c2==1)
              val2=m.val;
          c1--;
          c2--;
          m=m.next;
      }
        
        ListNode m1 = head;
         c1=first;
         c2=sec;
         while(m1!=null)
      {
          if(c1==1)
          {
             m1.val = val2;
          }
          if(c2==1)
              m1.val=val1;
          c1--;
          c2--;
          m1=m1.next;
      }
        return head;
        */
    }
}