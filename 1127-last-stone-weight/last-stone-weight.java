class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int it:stones)
            pq.add(it);

        while(!pq.isEmpty())
        {
            if(pq.size()==1)
                return pq.poll();
            int first = pq.poll();
            int second = pq.poll();
            if(first != second)
                pq.add(first-second);
        }

        return 0;
    }
}