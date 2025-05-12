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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        ListNode trav = dummy;
        ListNode temp = head;
        while(temp!=null)
        {
            if(temp.val!=val)
            {
                trav.next = temp;
                trav = trav.next;
            }

            temp = temp.next;
        }
        trav.next = null;

        return dummy.next;
    }
}