class Solution {
    public int maximumCount(int[] nums) {
        int posCount=0,negCount=0;
        for(int it:nums)
        {
            if(it>0) posCount++;
            else if(it<0) negCount++;
        }

        return Math.max(posCount,negCount);
    }
}