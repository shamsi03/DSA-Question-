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
    public void reorderList(ListNode head) {
        if(head.next==null)  return;
        ListNode rabb = head, tort = head;
        while(rabb!=null && rabb.next!=null && rabb.next.next!=null)
        {
            rabb = rabb.next.next;
            tort = tort.next;
        }

        //reverse through the mid to end
        tort.next = reverse(tort.next);
        
        ListNode ans = new ListNode(-1);
        ListNode reorderHead = ans;
        ListNode addNode = head,reverseHead = tort.next;
        while(reverseHead!=null)
        {
            ListNode temp = addNode.next;
            reorderHead.next = addNode;
            reorderHead = reorderHead.next;
            reorderHead.next = reverseHead;
            addNode = temp;
            reverseHead = reverseHead.next;
            reorderHead = reorderHead.next;
        }
        if(addNode==tort)
        {
            reorderHead.next = addNode;
            addNode.next = null;
        }
        head = ans.next;
    }

    public ListNode reverse(ListNode head)
    {
        ListNode prev = null;
        ListNode curr = head;
        ListNode nxt = null;
        while(curr!=null)
        {
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}