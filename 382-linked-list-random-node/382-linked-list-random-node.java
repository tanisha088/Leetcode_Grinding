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
    
    int[] arr;
     int size;
    public Solution(ListNode head) {
       size=0;
        ListNode h =  head;
        while(h!=null)
        {
            h=h.next;
            size++;
        }
        arr=  new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = head.val;
            head=head.next;
        }
    }
    
    public int getRandom() {
        
        Random r=  new Random();
        int in =  r.nextInt(size);
        return arr[in];
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */