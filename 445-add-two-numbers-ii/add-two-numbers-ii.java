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
        ListNode temp1 = reverse(l1);
        ListNode temp2 = reverse(l2);

        ListNode sumNode = new ListNode(-1);
        ListNode copy = sumNode;
        int carry=0,sum=0;
        while(temp1!=null && temp2!=null){
            sum = temp1.val+temp2.val+carry;
            copy.next = new ListNode(sum%10);
            carry = sum/10;

            //next jump for the traversing
            copy = copy.next;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }

        while(temp1!=null)
        {
            sum = temp1.val+carry;
            copy.next = new ListNode(sum%10);
            carry = sum/10;

            //next jump for the traversing
            copy = copy.next;
            temp1 = temp1.next;   
        }
        
        while(temp2!=null)
        {
            sum = temp2.val+carry;
            copy.next = new ListNode(sum%10);
            carry = sum/10;

            //next jump for the traversing
            copy = copy.next;
            temp2 = temp2.next;
        }
        
        if(carry==1)
            copy.next = new ListNode(carry);

        return reverse(sumNode.next);
    }
    ListNode reverse(ListNode head)
    {
        ListNode prev = null,curr=head,nxt=null;
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