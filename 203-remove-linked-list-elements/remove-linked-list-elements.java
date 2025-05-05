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
        if(head==null || (head.next==null && head.val==val))
            return null;
        ListNode temp = head;
        ListNode prev = head;
        while(temp!=null)
        {
            if(temp.val==val && temp==head)
            {
                head = temp.next;
                temp = temp.next;
            }
            else if(temp.val == val)
            {
                prev.next = temp.next;
                temp = temp.next;
            }
            else{
                prev = temp;
                temp = temp.next;
            }
        }

        return head;
    }
}