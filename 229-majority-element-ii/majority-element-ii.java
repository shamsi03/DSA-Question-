class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer>ans = new ArrayList<>();

        HashMap<Integer,Integer>m = new HashMap<>();
        for(int i=0;i<nums.length;i++)
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);

        for(int it:m.keySet())
        {
            if(m.get(it) > nums.length/3)
                ans.add(it);
        }

        return ans;
    }
}