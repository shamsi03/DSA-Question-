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
    public ListNode middleNode(ListNode head) {
        //Rabbit tortose algo
        ListNode rabbit = head;
        ListNode tortose = head;

        while(rabbit!=null && rabbit.next!=null)
        {
            rabbit = rabbit.next.next;
            tortose = tortose.next;
        }

        return tortose;
    }
}