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
        ListNode ans = new ListNode(-1);
        ListNode trav = ans;
        ListNode temp = head;
        while(temp.next!=null)
        {
            trav.next = new ListNode(temp.val);
            trav = trav.next;
            int data = findGCD(temp.val,temp.next.val);
            trav.next = new ListNode(data);
            trav = trav.next;
            temp = temp.next;
        }
        trav.next = temp;

        return ans.next;
    }
    public int findGCD(int num1 , int num2)
    {
        if(num2==0)
            return num1;

        return findGCD(num2,num1%num2);
    }
}