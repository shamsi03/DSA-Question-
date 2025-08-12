class Solution {
    public int findMin(int[] nums) {
        int min_element = Integer.MAX_VALUE;
        int low = 0 , high = nums.length-1;

        while(low <= high)
        {
            int mid = low + (high-low)/2;

            if(nums[low] <= nums[mid]) //left part sorted
            {
                //low element alwasy be minimum of the left part 
                min_element = Math.min(min_element,nums[low]); 
                low = mid+1; //move to the right part
            }
            else{ //right part sorted
                //mid element always be minimum of the right part
                min_element = Math.min(min_element,nums[mid]);
                high = mid-1; //move to the left side for looking the minimum
            }
        }

        return min_element;
    }
}