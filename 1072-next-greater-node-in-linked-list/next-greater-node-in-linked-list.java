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
    public int[] nextLargerNodes(ListNode head) {
        ListNode temp = head;
        int count=0;
        while(temp!=null)
        {
            count++;
            temp = temp.next;
        }
        int store[] = new int[count];
        temp = head;
        int index = 0;
        while(temp!=null)
        {
            store[index++] = temp.val;
            temp = temp.next;
        }

        int nxtGrt[] = new int[count];
        Stack<Integer>s = new Stack<>();
        for(int i=count-1;i>=0;i--)
        {
            while(!s.isEmpty() && store[s.peek()] <= store[i])
            {
                s.pop();
            }
            if(s.isEmpty())
                nxtGrt[i] = 0;
            else
                nxtGrt[i] = store[s.peek()];

            s.push(i);
        } 

        return nxtGrt;
    }
}