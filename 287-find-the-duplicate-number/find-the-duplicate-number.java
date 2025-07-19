class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for(int it:nums)
        {
            // if(set.contains(it))
            //         return it;
            // else
            //     set.add(it);

            if(!set.add(it)) return it;
        }

        return 1;
    }
}