/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode intersectNode = null;
        ListNode temp = headA;
        while(temp!=null)
        {
            ListNode search = headB;
            while(search!=null)
            {
                if(search == temp){
                    intersectNode = temp;
                    return intersectNode;
                }
                search = search.next;
            }
            temp = temp.next;
        }

        return intersectNode;
    }
}