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
    public ListNode doubleIt(ListNode head) {
        ListNode revHead = reverse(head);
        ListNode dummy = new ListNode(-1);
        ListNode trav = dummy;
        int carry = 0;
        while(revHead!=null)
        {
            int getDouble = revHead.val*2 + carry;
            trav.next = new ListNode(getDouble%10);
            carry = getDouble/10;
            trav = trav.next;
            revHead = revHead.next;
        }
        if(carry>0)
            trav.next = new ListNode(carry);

        return reverse(dummy.next);
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null,curr=head,nxt=null;
        while(curr!=null)
        {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}