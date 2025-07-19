class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set1 = new HashSet<>();
        HashSet<Integer>set2 = new HashSet<>();
        for(int it:nums1)
            set1.add(it);

        for(int it:nums2)
            set2.add(it);

        HashSet<Integer>set3 = new HashSet<>();
        for(int it:set1)
        {
            if(set2.contains(it))
                set3.add(it);
        }

        int ans[] = new int[set3.size()];
        int i=0;
        for(int it:set3)
            ans[i++] = it;

        return ans;

    }
}