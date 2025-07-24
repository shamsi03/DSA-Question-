class Solution {
    public int longestOnes(int[] nums, int k) {
        int right=0,left=0,maxOnes=0,countZero=0;
        while(right<nums.length)
        {
            if(nums[right]==0) countZero++;
            
            //ek baar shrink
            if(countZero > k)
            {
                if(nums[left]==0)
                    countZero--;

                left++;
            }
            // and check valid subarray or not 
            if(countZero<=k)
                maxOnes = Math.max(maxOnes,right-left+1);

            //expand again -> window ko samjh ek baar ke baad fix kar liya , fix window ke beyond aapne window ko shrink nahi karunga 
            right++;
        }

        return maxOnes;
    }
}