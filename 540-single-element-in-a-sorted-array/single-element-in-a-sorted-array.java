class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        //Optimal Approach

        int size = nums.length;

        if(size == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        if(nums[size-2] != nums[size-1]) return nums[size-1];

        int low = 1 , high = size-2;
        while(low <= high)
        {
            int mid = low + (high - low)/2;

            if(nums[mid-1]!=nums[mid]  && nums[mid]!=nums[mid+1]) 
                return nums[mid];
            else{
                if(nums[mid-1]==nums[mid])
                {
                    if((mid-1)%2==0 && mid%2!=0) //(even,odd)
                        low = mid+1;
                    else
                        high = mid-1;
                }
                else{
                    if(mid%2!=0 && (mid+1)%2==0 ) //(odd,even)
                        high = mid-1;
                    else
                        low = mid+1;
                }
            }
        }

        return -1;
    }
}