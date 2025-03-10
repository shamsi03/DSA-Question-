class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int hash[] = new int[nums.length+1];
        List<Integer>li = new ArrayList<>();
        for(int it:nums)
            hash[it]++;

        for(int i=1;i<hash.length;i++)
        {
            if(hash[i]==0)
                li.add(i);
        }


        return li;
    }
}