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
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head,slow=head;

        boolean check = false;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow)
            {
                check = true;
                break;
            }
        }
        if(check == false) return null;

        slow = head;
        while(fast!=slow)
        {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }
}