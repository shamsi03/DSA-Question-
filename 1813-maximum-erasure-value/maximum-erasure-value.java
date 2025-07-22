class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        int left=0,right=0,sum=0,maxSum=0;

        while(right<nums.length)
        {
            while(set.contains(nums[right]))
            {
                sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }

            sum += nums[right];
            set.add(nums[right]);
            maxSum = Math.max(maxSum,sum);
            right++;
        }

        return maxSum;
    }
}