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
    ListNode extra = null;
    public ListNode reverseBetween(ListNode head, int left, int right) {
         if(head==null || head.next==null || left==right)
             return head;
       /* 
         ListNode h2 = head;
        int l=-1;
        int r=-1;
      while(h2!=null)
      {
          if(h2.val==left)
              l++;
          if(h2.val==right);
          r++;
          h2=h2.next;
      }
        if(l==-1 || r==-1)
            return head;
        */
        ListNode h1 = head;
        ListNode prev=null;
        int k=-1;
        while(h1!=null && h1.next!=null && left>2)
        {
             prev=h1;
             h1=h1.next;
            left--;
            right--;
        }       int val = head.val;
      if(prev!=null)
             val=h1.next.val;
        else
        {
            if(left==2)
                val=head.next.val;
        }
        ListNode nh = reverse(h1,left,right-1,0);
        if(nh==null)
            return head;
        
     //   System.out.println(nh.val+" "+prev);
        if(prev==null)
            return nh;
         prev.next=nh;
        
        return head;
    }
    
    public ListNode reverse(ListNode h1,int left,int right,int count)
    {
          if(right==0)
          {
              extra = h1.next;
              h1.next=null;
          }
        
        if(h1==null || h1.next==null)
            return h1;
        
        ListNode newHead = reverse(h1.next,left,right-1, count+1);
        if(left!=1 && count==0)
        {
            h1.next.next=extra;
            h1.next=newHead;
            return h1;
        }
        
        h1.next.next=h1;
        h1.next=null;
        if(count==0 && left==1)
            h1.next=extra;
        return newHead;
    }
}

// 1 -> 8 -> 9 -> 10 -> 2 -> 3 -> 4 -> 5 -> 11 -> 12-> 13
 //   1->8->9  10->2<-3<-4         gp -   5->11->12->13
