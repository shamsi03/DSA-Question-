class Solution {
    public int findMaxK(int[] nums) {
        HashMap<Integer,Integer>m = new HashMap<>();
        int ans = -1;
        for(int i=0;i<nums.length;i++)
        {
            int x = nums[i] * -1;
            if(m.containsKey(x))
                ans = Math.max(ans,Math.abs(x));

            m.put(nums[i],i);
        }

        return ans;
    }
}