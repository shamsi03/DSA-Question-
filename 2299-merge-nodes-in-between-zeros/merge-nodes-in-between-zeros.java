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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = new ListNode(0);
        ListNode copy = temp;
        int sum = 0;
        ListNode merge = head.next;
        while(merge!=null)
        {
            if(merge.val==0)
            {
                copy.next = new ListNode(sum);
                sum = 0;
                copy = copy.next;
                merge = merge.next;
            }
            else{
                sum += merge.val;
                merge = merge.next;
            }
        }

        return temp.next;
    }
}