class Solution {
    public int sumOfUnique(int[] nums) {
        int size = 0;
        for(int it:nums)
        {
            if(size<it)
                size = it;
        }

        int hash[] = new int[size+1];
        for(int it:nums)
            hash[it]++;
        
        int sum=0;
        for(int i=0;i<hash.length;i++)
        {
            if(hash[i]==1)
                sum += i;
        }

        return sum;

    }
}