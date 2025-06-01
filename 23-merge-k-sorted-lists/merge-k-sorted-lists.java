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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(ListNode node : lists)
        {
            ListNode temp = node;
            while(temp!=null)
            {
                pq.add(temp.val);
                temp = temp.next;
            }
        }

        ListNode sortedHead = new ListNode(-1);
        ListNode trav = sortedHead;
        while(!pq.isEmpty())
        {
            trav.next = new ListNode(pq.remove());
            trav = trav.next;
        }

        return sortedHead.next;
    }
}