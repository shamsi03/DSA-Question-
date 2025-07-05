class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix_prod[] = new int[nums.length];
        prefix_prod[0] = 1;
        for(int i=1;i<nums.length;i++)
            prefix_prod[i] = prefix_prod[i-1]*nums[i-1];

        int suffix_prod[] = new int[nums.length];
        suffix_prod[nums.length-1] = 1;
        for(int i=nums.length-2;i>=0;i--)
            suffix_prod[i] = suffix_prod[i+1]*nums[i+1];

        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
            ans[i] = prefix_prod[i] * suffix_prod[i];

        return ans;

    }
}