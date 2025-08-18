class Solution {
    public int singleNonDuplicate(int[] nums) {
        //Optimal Approach 

        int size = nums.length;

        if(size == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[size-2] != nums[size-1]) return nums[size-1];

        int low = 1 , high = size-1;

        while(low <= high)
        {
            int mid = low + (high - low)/2;

            if(nums[mid-1]!=nums[mid]  && nums[mid]!=nums[mid+1])
                return nums[mid];

            //I'm on left part eliminate left part
            if((mid%2==0 && nums[mid] == nums[mid+1]) || (mid%2==1 && nums[mid-1] == nums[mid]))  low = mid+1; 
            else
                high = mid-1; //right part eliminate
        }

        return -1;
    }
}