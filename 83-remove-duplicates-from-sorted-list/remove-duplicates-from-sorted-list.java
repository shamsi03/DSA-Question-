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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null) return head;
       ListNode dummy = new ListNode(-1);
       ListNode trav = dummy;
       while(head.next!=null)
       {
            if(head.val!=head.next.val)
            {
                trav.next = head;
                trav = trav.next;
            }

            head = head.next;
       } 
       if(head!=null)
            trav.next = head;

        return dummy.next;
    }
}