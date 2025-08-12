class Solution {
    public int findMin(int[] nums) {
        int min_element = Integer.MAX_VALUE;
        int low = 0 , high = nums.length-1;

        while(low <= high)
        {
            int mid = low + (high-low)/2;
            if(nums[low] <= nums[mid] && nums[mid]<=nums[high])
            {
                min_element = Math.min(min_element,nums[low]);
                low++;
                high--;
                continue;
            }


            if(nums[low] <= nums[mid])
            {
                min_element = Math.min(min_element,nums[low]);
                low = mid+1;
            }
            else{
                min_element = Math.min(min_element,nums[mid]);
                high = mid-1;
            }
        }


        return min_element;
    }
}