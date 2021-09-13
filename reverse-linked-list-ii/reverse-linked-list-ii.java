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
          
        if(head==null || head.next==null)
            return head;
        
        ListNode dummy =  new ListNode(-1,head);
        
        head=dummy;
        int count = right-left;
        while(left!=1)
        {
            left--;
            head=head.next;
        }
        ListNode prev = head;
        ListNode curr = head.next;
        if(curr.next==null)
            return dummy.next;
        ListNode then =  curr.next;
   System.out.println(prev.val+" "+curr.val+" "+then.val);
      while(count!=0)
      {
          ListNode pnext= prev.next;
          prev.next = then;
          curr.next = then.next;
          then.next = pnext;
          then = curr.next;
          count--;
      }
        
        return dummy.next;
    }
        
//          if(head==null || head.next==null || left==right)
//              return head;
  
//         ListNode h1 = head;
//         ListNode prev=null;
//         int k=-1;
//         while(h1!=null && h1.next!=null && left>2)
//         {
//              prev=h1;
//              h1=h1.next;
//             left--;
//             right--;
//         }      
        
//         ListNode nh = reverse(h1,left,right,0);
      
//         if(prev==null)
//             return nh;
//          prev.next=nh;
        
//         return head;
//     }
    
//     public ListNode reverse(ListNode h1,int left,int right,int count)
//     {
//           if(right==1)
//           {
//               extra = h1.next;
//               h1.next=null;
//           }
        
//         if(h1==null || h1.next==null)
//             return h1;
        
//         ListNode newHead = reverse(h1.next,left,right-1, count+1);
//         if(left!=1 && count==0)
//         {
//             h1.next.next=extra;
//             h1.next=newHead;
//             return h1;
//         }
        
//         h1.next.next=h1;
//         h1.next=null;
//         if(count==0 && left==1)
//             h1.next=extra;
//         return newHead;
//     }
}

// 1 -> 8 -> 9 -> 10 -> 2 -> 3 -> 4 -> 5 -> 11 -> 12-> 13
 //   1->8->9  10->2<-3<-4         gp -   5->11->12->13
