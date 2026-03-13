class Solution {
    public int findDuplicate(int[] nums) {
        
        int temp[] = new int[100000];
        for(int i=0;i<nums.length;i++)
            temp[nums[i]-1]++;

        for(int i=0;i<100000;i++)
        {
            if(temp[i]>1)
                return i+1;
        }

        return 0;
    }
}