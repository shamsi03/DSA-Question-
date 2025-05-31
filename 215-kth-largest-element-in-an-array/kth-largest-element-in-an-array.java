class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->(b-a));
        Stack<Integer>st = new Stack<>();
        for(int it:nums)
            pq.add(it);

        // while(!pq.isEmpty())
        // {
        //     st.push(pq.remove());
        // }

        int index = 1;
        while(index<k)
        {
            pq.remove();
            index++;
        }

        return pq.remove();
    }
}