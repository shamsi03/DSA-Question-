class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int size=-1;
        for(int it:nums)
            size = Math.max(size,it);

        int hash[] = new int[size+1];
        for(int it:nums)
            hash[it]++;

        for(int it:hash)
        {
            if(it>2)
                return false;
        }

        return true;
    }
}