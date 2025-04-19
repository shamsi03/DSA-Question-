class Solution {
    public void sortColors(int[] nums) {
        for(int i=0;i<nums.length;i++)
        {
            int index = i;
            for(int j=i;j<nums.length;j++)
            {
                if(nums[index]>nums[j])
                    index = j;
            }
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }
    }
}