class Solution {
    public int mostFrequent(int[] nums, int key) {
        HashMap<Integer,Integer>m = new HashMap<>();
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==key)
                m.put(nums[i+1],m.getOrDefault(nums[i+1],0)+1);
        }

        int ans = -1, maxFreq=0;
        for(int k:m.keySet())
        {
            if(m.get(k)>maxFreq)
            {
                ans = k;
                maxFreq = m.get(k);
            }
        }

        return ans;
    }
}