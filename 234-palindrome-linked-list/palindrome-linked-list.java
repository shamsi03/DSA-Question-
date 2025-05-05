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
    public boolean isPalindrome(ListNode head) {
        if(head==null) return false;
        ListNode temp = new ListNode(0);
        ListNode add = temp;
        ListNode copy = head;
        while(head!=null)
        {
            add.next = new ListNode(head.val);
            add = add.next;
            head = head.next;
        }

        head = temp.next;

        ListNode reverseHead = reverse(copy);
        while(reverseHead!=null)
        {
            if(reverseHead.val!=head.val)
                return false;

            reverseHead = reverseHead.next;
            head = head.next;
        }
        return true;
    }

    ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt = null;
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