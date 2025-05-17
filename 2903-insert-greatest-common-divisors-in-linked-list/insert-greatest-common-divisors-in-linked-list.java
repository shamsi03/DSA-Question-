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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head.next==null) return head;
        ListNode dummy = new ListNode(-1);
        ListNode trav = dummy;
        ListNode temp = head;
        while(temp.next!=null)
        {
            trav.next = temp;
            trav = trav.next;
            int data = gcdNum(temp.val,temp.next.val);
            temp = temp.next;
            trav.next = new ListNode(data);
            trav = trav.next;           
        }

        trav.next = temp;
        return dummy.next;
    }

    public int gcdNum(int num1 , int num2)
    {
        if(num2==0)
            return num1;
        
        return gcdNum(num2,num1%num2);
    }
}