class Solution {
    public int mostFrequent(int[] nums, int key) {
        int size = 0;
        for(int it:nums)
        {
            if(size<it)
                size = it;
        }

        int hash[] = new int[size+1];
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==key)
                hash[nums[i+1]]++;
        }

        int ans=-1,maxFreq=0;
        for(int i=0;i<hash.length;i++)
        {
            if(hash[i] > maxFreq)
            {
                ans = i;
                maxFreq = hash[i];
            }
        }

        return ans;
    }
}