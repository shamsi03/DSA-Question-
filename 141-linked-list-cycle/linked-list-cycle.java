/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode r = head;
        ListNode t = head;
        while(r!=null && r.next!=null)
        {
            
            r = r.next.next;
            t = t.next;

            if(t==r)
                return true;

        }

        return false;
    }
}