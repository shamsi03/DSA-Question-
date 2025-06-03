class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer>m = new HashMap<>();
        for(int it:arr)
            m.put(it,m.getOrDefault(it,0)+1);

        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int it:m.keySet())
            pq.add(m.get(it));

        

        while(k>=1 && k>=pq.peek())
        {  
            k -= pq.remove();
        }
        
        return pq.size();
    }
}