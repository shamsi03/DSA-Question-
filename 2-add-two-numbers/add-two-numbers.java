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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(-1);
        ListNode trav = dummy;
        int carry = 0;
        while(l1!=null || l2!=null)
        {
            if(l1!=null && l2!=null)
            {
                int sum = l1.val + l2.val + carry;
                trav.next = new ListNode(sum%10);
                carry = sum/10;
                trav = trav.next;
                l1 = l1.next;
                l2 = l2.next;
            }
            else{
                if(l1!=null)
                {
                    int sum = l1.val + carry;
                    trav.next = new ListNode(sum%10);
                    carry = sum/10;
                    trav = trav.next;
                    l1 = l1.next;
                }
                else{
                    int sum = l2.val + carry;
                    trav.next = new ListNode(sum%10);
                    carry = sum/10;
                    trav = trav.next;
                    l2 = l2.next;
                }
            }
        }

        if(carry>0)
                trav.next = new ListNode(carry);

        return dummy.next;
    }
}