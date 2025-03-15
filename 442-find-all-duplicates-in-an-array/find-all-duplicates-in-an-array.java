class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int size=-1;
        List<Integer>ans = new ArrayList<>();
        for(int it:nums)
            size = Math.max(size,it);

        int hash[] = new int[size+1];

        for(int it:nums)
            hash[it]++;

        for(int i=0;i<hash.length;i++)
        {
            if(hash[i] == 2)
                ans.add(i);
        }


        return ans;
    }
}