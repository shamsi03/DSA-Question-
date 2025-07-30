class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0,minLen = Integer.MAX_VALUE;
        int right=0,left=0;

        while(right<nums.length)
        {
            sum += nums[right];

            while(sum >= target)
            {
                if(right-left+1 < minLen)
                    minLen = right-left+1;

                sum -= nums[left];
                left++;
            }

            right++;
        }


        return minLen == Integer.MAX_VALUE ? 0 : minLen ;
    }
}