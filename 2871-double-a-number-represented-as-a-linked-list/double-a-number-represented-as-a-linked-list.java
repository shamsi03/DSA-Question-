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
        // Stack<Integer>s = new Stack<>();
        // ListNode temp = head;
        // while(temp!=null)
        // {
        //     s.push(temp.val);
        //     temp = temp.next;
        // }

        ListNode temp = reverse(head);

        ListNode dummy = new ListNode(-1);
        ListNode trav = dummy;

        int carry=0,mult=1;
        while(temp!=null)
        {
            mult = temp.val*2+carry;
            trav.next = new ListNode(mult%10);
            carry = mult/10;
            temp = temp.next;
            trav = trav.next;
        }
        if(carry>0)
        {
            trav.next = new ListNode(carry);
            trav = trav.next;
        }


        return reverse(dummy.next);
    }

    ListNode reverse(ListNode head)
    {
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