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
    public ListNode partition(ListNode head, int x) {

        if(head==null || head.next==null) return head;
        ListNode smallLL = new ListNode(-1);
        ListNode less = smallLL;
        ListNode bigLL = new ListNode(-1);
        ListNode great = bigLL;
        ListNode temp = head;
        while(temp!=null)
        {
            if(temp.val<x)
            {
                less.next = temp;
                less = less.next;
                temp = temp.next;
            }
            else{
                great.next = temp;
                great = great.next;
                temp = temp.next;
            }
        }

        //now smaller first then greater , we add the greater linkedList to the smaller
        less.next = bigLL.next;
        great.next = null;


        return smallLL.next;
    }
}