class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>m = new HashMap<>();
        int majorElement = 0;
        for(int i=0;i<nums.length;i++)
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);

        for(int it:m.keySet())
        {
            if(m.get(it) > nums.length/2)
                majorElement = it;
        }

        return majorElement;
    }
}