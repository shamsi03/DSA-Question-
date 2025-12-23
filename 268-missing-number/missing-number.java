class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumAll = (n*(n+1))/2;
        int sum = 0;
        for(int it:nums)
            sum += it;

        return sumAll-sum;
    }
}