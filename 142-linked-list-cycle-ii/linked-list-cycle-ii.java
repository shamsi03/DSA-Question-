/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head==null || head.next==null) return null;
        ListNode fast=head,slow=head;

        boolean check = false;
        while(fast!=null && fast.next!=null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow) //cycle present
            {
                check = true;
                break;
            }
        }
        //cycle not present
        if(check == false) return null;

        slow = head;
        while(fast!=slow)
        {
            fast = fast.next;
            slow = slow.next;
        }

        //slow aur fast ek hi point ko locate karega tb hi loop se bahar aaye hai, simply fast or slow kisi ko bhi return kar do wahi se cycle begin hoga 

        return fast;
    }
}