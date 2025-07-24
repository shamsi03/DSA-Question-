class Solution {
    public int longestOnes(int[] nums, int k) {
        int right=0,left=0,maxOnes=0,countZero=0;
        while(right<nums.length)
        {
            if(nums[right]==0) countZero++;

            while(countZero > k)
            {
                if(nums[left]==0)
                    countZero--;

                left++;
            }

            if(countZero<=k)
                maxOnes = Math.max(maxOnes,right-left+1);

            right++;
        }

        return maxOnes;
    }
}