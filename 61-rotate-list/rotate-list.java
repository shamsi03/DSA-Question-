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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        else if(head.next==null || k==0) return head;
        int length = findLength(head);
        k = k%length;
        ListNode last = head;
        while(last.next!=null)
        {
            last = last.next;
        }
        last.next = head;

        //now find the k'th element which is the first element after the rotation
        last = head;
        int index = 1;
        length = length-k;
        while(index<length)
        {
            last = last.next;
            index++;
        }
        head = last.next;
        last.next = null;


        return head;
    }
    int findLength(ListNode head)
    {
        int count = 0;
        while(head!=null)
        {
            count++;
            head = head.next;
        }
        return count;
    }
}