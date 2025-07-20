class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>>pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        
        pq.addAll(map.entrySet());

        String ans = "";
        while(!pq.isEmpty()){
            Map.Entry<Character,Integer>mp = pq.poll();
            char ch = mp.getKey();
            int freq = mp.getValue();
            while(freq>=1)
            {
                ans += ch;
                freq--;
            }
        }

        return ans;
        
    }
}