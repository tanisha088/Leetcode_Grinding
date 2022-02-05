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
    public ListNode mergeKLists(ListNode[] lists) {
       
        if(lists.length==0)
            return null;
        
        ListNode res  = null;
        ListNode head = null;
        
        while(true)
        {
            int ind = findsmallest(lists);
            if(lists[ind]==null)
                return head;
            if(res==null)
            {
                res=lists[ind];
                head=lists[ind];
                lists[ind] = lists[ind].next;
            }
            else
            {
                ListNode k = lists[ind];
                res.next = k;
                res = k;
                k = k.next;
                lists[ind] = k;
            }
        }
        
        
        
    }
    
    public int findsmallest(ListNode[] lists)
    {
        ListNode n = lists[0];
        int ind = 0;
        for(int i=1;i<lists.length;i++)
        {
            if(lists[i]==null)
                continue;
            if(n==null)
            {
                n=lists[i];
                ind = i;
            }
            
            if(lists[i].val<n.val)
            {
                n = lists[i];
                ind = i;
            }
        }
        
        return ind;
    }
}