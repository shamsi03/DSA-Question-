class Solution {
    public int findDuplicate(int[] nums) {
        int ans = 0;
        HashMap<Integer,Integer>m = new HashMap<>();
        for(int it:nums)
            m.put(it,m.getOrDefault(it,0)+1);

        for(int it:m.keySet())
        {
            if(m.get(it)>1)
                ans = it;
        }

        return ans;
    }
}