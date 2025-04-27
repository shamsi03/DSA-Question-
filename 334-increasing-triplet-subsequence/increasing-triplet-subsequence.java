class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first=nums[0],second=Integer.MAX_VALUE,third=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            if(first>=nums[i])
                first = nums[i];
            else if(second>=nums[i] && nums[i]>first)
                second = nums[i];
            else if(third>=nums[i] && nums[i]>second)
                return true;
        }
        return false;
    }
}