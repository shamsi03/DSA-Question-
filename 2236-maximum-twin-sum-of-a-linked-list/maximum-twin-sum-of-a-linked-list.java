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
    public int pairSum(ListNode head) {
        Stack<Integer>s = new Stack<>();
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            s.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        int sum = 0, maxSum=0;
        while(slow!=null)
        {
            sum = s.peek() + slow.val;
            maxSum = Math.max(sum,maxSum);
            s.pop();
            slow = slow.next;
        }

        return maxSum;
    }
}