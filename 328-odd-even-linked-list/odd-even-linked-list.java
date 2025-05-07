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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null || head.next.next==null) return head;
       ListNode oddHead = new ListNode(-1);
       ListNode evenHead = new ListNode(-1); 

       ListNode odd = oddHead;
       ListNode even = evenHead;
       ListNode temp = head;
       while(temp!=null)
       {
            odd.next = temp;
            odd = odd.next;
            temp = temp.next;
            if(temp!=null){
                even.next = temp;
                even = even.next;
                temp = temp.next;
            }
       }
       odd.next = evenHead.next;
       even.next = null;

       return oddHead.next;
    }
}