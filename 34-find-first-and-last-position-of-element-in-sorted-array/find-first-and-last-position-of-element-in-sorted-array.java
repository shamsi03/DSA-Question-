class Solution {
    public int[] searchRange(int[] nums, int target) {

        if(nums.length == 0)
            return new int[] {-1,-1};

        int lb = findLowerBound(nums,target);

        if(lb == nums.length || nums[lb] != target )
            return new int[] {-1,-1};

        int ub = findUpperBound(nums,target);
        return new int[] {lb,ub-1};
    }

    int findLowerBound(int nums[],int target)
    {
        int low = 0, high = nums.length-1, idx = nums.length;
        while(low <= high)
        {
            int mid = (low+high)/2;

            if(nums[mid] >= target)
            {
                idx = mid;
                high = mid-1; //look for the smallest so move on the left side
            }
            else
                low = mid+1; //look to the right side
        }

        return idx;
    }

    int findUpperBound(int nums[],int target)
    {
        int low = 0, high = nums.length-1, idx = nums.length;
        while(low <= high)
        {
            int mid = low + (high - low)/2;

            if(nums[mid] > target)
            {
                idx = mid;
                high = mid-1; //look for the smallest so move on the left side
            }
            else
                low = mid+1; //look to the right side
        }

        return idx;
    }
}