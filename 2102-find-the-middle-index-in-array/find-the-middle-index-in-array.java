class Solution {
    public int findMiddleIndex(int[] nums) {
        
        int suffix_sum = Arrays.stream(nums).sum();
        int prefix_sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            prefix_sum += nums[i];
            if(prefix_sum == suffix_sum)
                return i;

            suffix_sum -= nums[i];
        }

        return -1;
    }
}