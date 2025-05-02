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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp = head;
        while(temp!=null)
        {
            temp = temp.next;
            count++;
        }
        count = count-n;
        if(count==0)
            return head.next;
        int index = 1;
        temp = head;
        while(index<count)
        {
            temp = temp.next;
            index++;
        }
        temp.next = temp.next.next;
         
        return head;
    }
}