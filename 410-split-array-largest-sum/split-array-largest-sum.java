class Solution {
    public int splitArray(int[] nums, int k) {
        
        int low = 0 ,high = 0;
        for(int it:nums){
            low = Math.max(it,low);
            high += it;
        }

        int ans = -1;
        while(low<=high){
            int mid = low + (high-low)/2;

            int checkSplit = splitSum(nums,mid);

            if(checkSplit <= k){
                ans = mid;
                high = mid-1;
            }
            else
                low = mid+1;
        }

        return ans;
    }

    int splitSum(int nums[] , int maxSum){
        int countArr = 1 , totalSumTaken = 0;
        for(int i=0;i<nums.length;i++){
            if(totalSumTaken + nums[i] <= maxSum)
                totalSumTaken += nums[i];
            else{
                countArr++;
                totalSumTaken = nums[i];
            }
        }

        return countArr; 
    }
}