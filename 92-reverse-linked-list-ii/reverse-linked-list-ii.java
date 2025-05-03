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

    ListNode reverse(ListNode head,int count)
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt = null;
        int index = 0;

        while(index<=count)
        {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
            index++;
        }
        if(curr!=null)
        {
            head.next = curr;
        }

        return prev;

    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==1) return reverse(head,right-left);
        int index = 1;
        ListNode temp = head;
        while(index<left-1)
        {
            temp = temp.next;
            index++;
        }

        ListNode pushRight = temp.next;

        //ListNode rightNode= head;
        // index = 1;
        // while(index<right)
        // {
        //     rightNode = rightNode.next;
        //     index++;
        // } 

        ListNode push = reverse(temp.next,right-left);
        temp.next = push;

        // pushRight.next = rightNode;

        return head;
    }
}