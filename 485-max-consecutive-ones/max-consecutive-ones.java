class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countOne = 0 , maxCount = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                countOne = 0;
            else{
                countOne ++;
                maxCount = Math.max(maxCount,countOne);
            }
        }

        return maxCount;
    }
}