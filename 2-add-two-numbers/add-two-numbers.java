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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        //dummy node 
        ListNode temp=new ListNode(0);
        //for the calculation
        ListNode curr=temp;
        while(l1!=null && l2!=null)
        {
            int sum =  l1.val + l2.val+carry;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            carry=sum/10; 
            l1 = l1.next;
            l2 = l2.next;
        } 
        while(l1!=null)
        {
            int sum =  l1.val +carry;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            carry=sum/10; 
            l1 = l1.next;
        } 
        while(l2!=null)
        {
            int sum = l2.val+carry;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            carry=sum/10; 
            l2 = l2.next;
        }
        //mtlb last wale carry wale me kuch bach jaye tb
        if(carry>0)  
            curr.next=new ListNode(carry);

        //refernce return kar diya second node ka , q ki first node to dummy hai uska use nahi kar rhe hai humlog
        return temp.next;
    }
}