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
        ListNode temp = head;
        int store = -110;
        while(temp.next!=null)
        {
            if(temp.val == temp.next.val || temp.val==store)
            {
                store = temp.val;
                temp = temp.next;
            }
            else{
                trav.next = temp;
                trav = trav.next;
                temp = temp.next;
            }
        }
        if(temp.val!=store)
        {
            trav.next = temp;
            trav = trav.next;
        }

        trav.next = null;
        return dummy.next;
    }
}