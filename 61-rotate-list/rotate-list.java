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

        int length = findLength(head);
        ListNode last = head;
        if(head==null) return null;
        else if(head.next==null || k==0) return head;

        k = k%length;
        for(int i=1;i<=k;i++)
        {
            last = head;
            while(last.next.next!=null)
            {
                last = last.next;
            }
            last.next.next = head;
            head = last.next;
            last.next = null;
        }

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