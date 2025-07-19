class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer>set1 = new HashSet<>();
        for(int it:nums1)
            set1.add(it);

        HashSet<Integer>set2 = new HashSet<>();
        for(int it:nums2)
        {
            if(set1.contains(it))
                set2.add(it);
        }

        int ans[] = new int[set2.size()];
        int i=0;
        for(int it:set2)
            ans[i++] = it;

        return ans;
    }
}