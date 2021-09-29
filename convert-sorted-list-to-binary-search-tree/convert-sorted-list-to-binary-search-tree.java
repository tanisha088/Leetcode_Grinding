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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        
       
        int size=0;
        ListNode dum =  head;
        while(dum!=null)
        {
            dum= dum.next;
            size++;
        }
        
        return fn(head,size);
    }
    
    public TreeNode fn(ListNode head,int size)
    {
        if(head==null || size==0)
            return null;
        
        if(size==1)
            return new TreeNode(head.val);
        
        ListNode slow= head;
        ListNode fast=head;
        ListNode prev=null;
        while(fast!=null && fast.next!=null)
        {
            prev=slow;
            slow = slow.next;
            fast=fast.next.next;
        }
        
        TreeNode root = new TreeNode(slow.val);
        int rsize=0;
      
        ListNode rside =  slow;
        while(rside.next!=null)
        {
            rside =rside.next;
            rsize++;
        }
        
         rside =  slow.next;
        slow.next=null;
        prev.next=null;
  //      System.out.println(head.val+" "+rsize+" "+root.val);
        
    root.left =  fn(head,size-rsize-1);
        root.right = fn(rside,rsize);
        
        return root;
    }
}



// -10,-3,0,5,9
    
    
//     5
    
//     2
    
//          5
    
    