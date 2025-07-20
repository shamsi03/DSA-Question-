class Solution {
    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int it:nums)
            map.put(it,map.getOrDefault(it,0)+1);
        
        for(int it:map.keySet())
        {
            if(map.get(it)>=2)
                return it;
        }

        return -1;
    }
}