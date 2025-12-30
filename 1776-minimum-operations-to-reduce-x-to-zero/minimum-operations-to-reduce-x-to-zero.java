class Solution {
    public int minOperations(int[] nums, int x) {
        int totalSum = 0;
        for(int it:nums)
            totalSum += it;

        

        int maxLen = 0,target=totalSum-x;
        if(target  == 0) return nums.length;
            int sum = 0,j=0,i=0;
            while(j<nums.length){
                sum += nums[j];
                while(i<j && sum > target){
                    sum -= nums[i];
                    i++;
                }
                if(sum == target)
                    maxLen = Math.max(maxLen,j-i+1);

                j++;
            }

        if(maxLen == 0) return -1;

        return nums.length-maxLen;
    }
}