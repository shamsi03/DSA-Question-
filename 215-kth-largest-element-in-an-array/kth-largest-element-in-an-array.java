class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->(b-a));
        for(int it:nums)
            pq.add(it);

        int index = 1;
        while(index<k)
        {
            pq.remove();
            index++;
        }

        return pq.remove();
    }
}