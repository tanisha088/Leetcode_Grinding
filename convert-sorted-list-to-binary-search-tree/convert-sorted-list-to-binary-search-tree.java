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
    ListNode gh= null;
    public TreeNode sortedListToBST(ListNode head) {
        
        /*
        int size=0;
        ListNode h = head;
        while(h!=null)
        {
            size++;
            h=h.next;
        }
        gh = head;
        return stobst(size);
        */
        
        // INCASE YOU DON'T WANT TO KEEP A GLOBAL HEAD ---->
    //      if(head==null) return null;
    // return toBST(head,null);
        
        if(head==null)
            return null;
        
        if(head.next==null)
	return new TreeNode(head.val);

	
	ListNode prev=null;

	ListNode slow=head;
	ListNode fast=head;

	while(fast!=null && fast.next!=null)
	{
	prev=slow;
	slow=slow.next;
	fast=fast.next.next;
	}

    TreeNode node = new TreeNode(slow.val);

prev.next= null;
ListNode next = slow.next;
slow.next= null;
    //    System.out.println(node.val);
    node.left = sortedListToBST(head);
    node.right = sortedListToBST(next);

return node;
        
    }
    
   
     
public TreeNode toBST(ListNode head, ListNode tail){
    ListNode slow = head;
    ListNode fast = head;
    if(head==tail) return null;
    
    while(fast!=tail&&fast.next!=tail){
        fast = fast.next.next;
        slow = slow.next;
    }
    TreeNode thead = new TreeNode(slow.val);
    thead.left = toBST(head,slow);
    thead.right = toBST(slow.next,tail);
    return thead;
}
    public TreeNode stobst(int size)
    {
        if(size==0)
            return null;
        
        TreeNode l = stobst(size/2);
        TreeNode root = new TreeNode(gh.val);
        gh=gh.next;
        TreeNode r = stobst(size-size/2-1);
        
        root.left = l;
        root.right = r;
        
        return root;
    }
}