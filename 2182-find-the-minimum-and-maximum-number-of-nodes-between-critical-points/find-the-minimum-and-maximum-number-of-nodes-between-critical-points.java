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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int ans[] = {-1,-1};
        if(head.next==null || head.next.next==null) return ans;
        ListNode temp = head.next;
        ListNode prev = head;
        int count = 2,criticalPoint=0;
        ArrayList<Integer>li = new ArrayList<>();
        while(temp.next!=null)
        {
            if( (temp.val>prev.val && temp.val>temp.next.val) || (temp.val<prev.val && temp.val<temp.next.val) ){
                li.add(count);
                criticalPoint++;
            }

            count++;
            prev = temp;
            temp = temp.next;
        }
        Collections.sort(li);
        if(criticalPoint>=2){
            int minima = Integer.MAX_VALUE;
            for(int i=0;i<li.size()-1;i++)
            {
                minima = Math.min(minima,li.get(i+1)-li.get(i));
                //System.out.println(li.get(i));
            }
            ans[0] = minima;
            ans[1] = li.get(li.size()-1) - li.get(0);;
        }
        else{
            return ans;
        }
        return ans;
    }
}