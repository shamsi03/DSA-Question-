class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        Stack<Integer>st = new Stack<>();
        for(int it:nums)
            pq.add(it);

        while(!pq.isEmpty())
        {
            st.push(pq.remove());
        }

        int index = 1;
        while(index<k)
        {
            st.pop();
            index++;
        }

        return st.pop();
    }
}