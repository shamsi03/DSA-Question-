class Solution {
    public int[] leftRightDifference(int[] nums) {

        // calculate the prefix sum without that index value
        int prefix_sum[] = new int[nums.length];
        for(int i=1;i<nums.length;i++)
            prefix_sum[i] = prefix_sum[i-1]+nums[i-1];
        
        // for(int it:prefix_sum)
        //     System.out.print(it +" ");


        // calculate the suffix sum without that index value
        int suffix_sum[] = new int[nums.length];
        for(int i=nums.length-2;i>=0;i--)
            suffix_sum[i] = suffix_sum[i+1] + nums[i+1];

        // for(int it:suffix_sum)
        //     System.out.print(it +" ");

        // calculate the absolute difference of uske aage ke sare element ka sum and piche ke sare element ka sum
        for(int i=0;i<nums.length;i++)
            nums[i] = Math.abs(suffix_sum[i]-prefix_sum[i]);

        return nums;
    }
}