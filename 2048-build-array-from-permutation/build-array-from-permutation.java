class Solution {
    public int[] buildArray(int[] nums) {

    /* Its takes the O(n) space , so we can further optimised this code 

        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i] = nums[nums[i]];
        }

        return ans;

    */

        int n = nums.length;
        for(int i=0;i<n;i++)
        {
            nums[i] += (n*(nums[nums[i]]%n));
        }

        for(int i=0;i<n;i++)
            nums[i] /= n;


        return nums;
    }
}