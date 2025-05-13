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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null && n!=0) return null;

        ListNode fast = head;
        int index = 1;
        while(index<n)
        {
            fast = fast.next;
            index++;
        }

        //mtlb first element ko delete karne k liye ye condition kaam aayegi
        if(fast.next==null)
            return head.next;

        //fast and slow k bich me difference 'n' ke equal hi hoga 
        ListNode slow = head;
        while(fast.next.next!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }
        slow.next = slow.next.next;

        return head;
    }
}