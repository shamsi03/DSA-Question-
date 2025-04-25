class Solution {
    public int search(int[] nums, int target) {
        int start=0,end=nums.length-1;
        while(start<=end)
        {
            int mid = end - (end-start);
            if(nums[mid]==target)
                return mid;
            else if(nums[0]<=nums[mid]) // means right side sorted array
            {
                //kuch test cases aise honge jinme target and start ki value same hi hogi.
                // usi test cases ko handle karne k liye equal to lgaye 
                if(nums[mid]>target && target>=nums[start])
                    end = mid-1;
                else
                    start = mid+1;
            }
            else{ //means left side sorted 
                //kuch test cases aise honge jinme target and end ki value same hi hogi.
                // usi test cases ko handle karne k liye equal to lgaye 
                if(nums[mid]<target && target<=nums[end])
                    start = mid+1;
                else
                    end = mid-1;
            }
        }

        return -1;
    }
}