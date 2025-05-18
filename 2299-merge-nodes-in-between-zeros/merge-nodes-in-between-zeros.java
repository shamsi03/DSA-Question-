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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode trav = dummy;
        int sum = 0;

        //because first always zero 
        ListNode temp = head.next;

        //because last node also be zero
        while(temp!=null)
        {
            if(temp.val==0)
            {
                trav.next = new ListNode(sum);
                sum = 0;
                trav = trav.next;
            }
            else
                sum += temp.val;

            temp = temp.next;
        }

        return dummy.next;
    }
}