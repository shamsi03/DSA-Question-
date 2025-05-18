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
       ArrayList<Integer>a = new ArrayList<>();
       ListNode slow = head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            a.add(slow.val);
            fast = fast.next.next;
            slow = slow.next;
        }

        // slow = slow.next;
        int ans = 0;
        int size = a.size()-1;
        while(slow!=null)
        {
            int sum = a.get(size--) + slow.val;
            ans = Math.max(ans,sum);
            slow = slow.next;
           // size = size-1;
        }

        return ans;

    }
}