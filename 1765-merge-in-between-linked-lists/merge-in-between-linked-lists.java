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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        for(int i=b;i>=a;i--)
            deleteNode(list1,i);

        ListNode temp = list2;
        while(temp.next!=null)
        {
            temp = temp.next;
        }

        ListNode temp1 = list1;
        while(a>1)
        {
            temp1 = temp1.next;
            a--;
        }

        temp.next = temp1.next;
        temp1.next = list2;
        return list1;
    }

    public void deleteNode(ListNode head,int index)
    {
        ListNode temp = head;
        while(index>1)
        {
            temp = temp.next;
            index--;
        }
        temp.next = temp.next.next;
    }
}