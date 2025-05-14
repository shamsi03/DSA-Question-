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
    public ListNode sortList(ListNode head) {

        if(head==null || head.next==null) return head;

        List<Integer>li = new ArrayList<>();
        ListNode temp = head;
        while(temp!=null)
        {
            li.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(li);

        ListNode sortLl = new ListNode(-1);
        ListNode trav = sortLl;
        for(int i=0;i<li.size();i++)
        {
            trav.next = new ListNode(li.get(i));
            trav = trav.next;
        }

        return sortLl.next;
    }
}