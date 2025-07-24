class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxOnes = 0;
        for(int i=0;i<nums.length;i++)
        {
            int countZero = 0;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[j] == 0)
                    countZero++;


                if(countZero<=k)
                    maxOnes = Math.max(maxOnes,j-i+1);
                else
                    break;
            }
        }

        return maxOnes;
    }
}