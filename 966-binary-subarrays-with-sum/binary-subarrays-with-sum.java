class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        
        //find first number of subarray which sum has less than and equal to goal

        int findSubLessGoal = findCountSub(nums,goal);

        //find the number of subarray which sum have lesser than equal to goal-1 

        int findSubLessGoal_1 = findCountSub(nums,goal-1);


        return (findSubLessGoal - findSubLessGoal_1);
    }

    int findCountSub(int[] nums,int goal)
    {
        int left=0,right=0,countSub=0,sum=0;
        while(right < nums.length)
        {
            sum += nums[right];

            while(left < right && sum > goal)
            {
                sum -= nums[left];
                left++;
            }

            if(sum <= goal)
                countSub += (right-left+1);

            right++;
        }

        return countSub;
    }
}