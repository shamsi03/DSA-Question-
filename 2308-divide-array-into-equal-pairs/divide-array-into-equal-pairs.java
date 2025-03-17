class Solution {
    public boolean divideArray(int[] nums) {
        int n = nums.length;
        if(n%2==1) return false;

        int hash[] = new int[502];
        for(int it:nums)
            hash[it]++;

        for(int it:hash)
        {
            if(it%2!=0)
                return false;
        }


        return true;
    }
}