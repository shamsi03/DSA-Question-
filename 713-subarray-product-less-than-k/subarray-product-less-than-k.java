class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;

        int l=0,r=0,totalSubarr=0,prod=1;
        while(r<nums.length)
        {
            prod *= nums[r];
            while(l<=r && prod>=k)
            {
                prod /= nums[l];
                l++;
            }

            if(prod<k)
                totalSubarr += (r-l+1);

            r++;
        }

        return totalSubarr;
    }
}