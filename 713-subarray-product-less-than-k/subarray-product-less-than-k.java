class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int totalSubarr = 0, l = 0,r = 0;
        double prod = 1;
        while(r<nums.length)
        {
            prod *= nums[r];
            while(l<nums.length && prod>=k)
            {
                prod = Math.ceil((prod/nums[l]));
                l++;
            }
            if(prod<k){
                totalSubarr += (r-l+1);
            }

            r++;
        }
        //System.out.println(1/2);
        return totalSubarr;
    }
}