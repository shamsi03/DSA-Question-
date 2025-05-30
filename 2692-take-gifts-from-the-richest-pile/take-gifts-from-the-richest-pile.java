class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer>pq = new PriorityQueue<>((a,b)->b-a);
        for(int it:gifts)
            pq.add(it);

        while(k>0)
        {
            int max = pq.remove();
            pq.add((int)Math.sqrt(max));
            k--;
        }

        long ans = 0L;
        for(int it:pq)
            ans += it;

        return ans;
    }
}