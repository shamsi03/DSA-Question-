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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode fast = head;
        int index = 1;
        while(index<k)
        {
            fast = fast.next;
            index++;
        }
        ListNode store = fast;
        ListNode slow = head;
        while(fast.next!=null)
        {
            fast = fast.next;
            slow  = slow.next;
        }

        //swapping the value store and slow 
        int temp = store.val;
        store.val = slow.val;
        slow.val = temp;

        return head;
    }
}