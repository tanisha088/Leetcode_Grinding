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
        
        int size=0;
        ListNode h = head;
        while(h!=null)
        {
            size++;
            h=h.next;
        }
        gh = head;
        return stobst(size);
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