/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        
        if(node.next==null)
            node=null;
        else
        {
            ListNode m = node.next;
            int t= m.val;
            m.val = node.val;
            node.val = t;
            node.next = node.next.next;
        }
    }
}