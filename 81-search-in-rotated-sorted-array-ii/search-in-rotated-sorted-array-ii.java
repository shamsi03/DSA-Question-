class Solution {
    public boolean search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end)
        {
            int mid = end - (end-start)/2;
            if(nums[mid]==target) return true;
            else if(nums[mid]>nums[0]) //left side sorted
            {
                if(nums[mid]>target && target>=nums[start])
                    end = mid-1;
                else 
                    start = mid+1;
            }
            else if(nums[mid]==nums[start] && nums[start] == nums[end])
            {
                start = start+1;
                end = end-1;
            }
            else if(nums[start]==nums[mid])
                start = start+1;
            else{ // right side sorted
                if(nums[mid]<target && target<=nums[end])
                    start = mid+1;
                else
                    end = mid-1;
            }
        }

        return false;
    }
}