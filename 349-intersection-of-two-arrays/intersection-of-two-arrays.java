class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer>set1 = new HashSet<>();
        for(int it:nums1)
            set1.add(it);

        ArrayList<Integer>li = new ArrayList<>();
        for(int it:nums2)
        {
            if(set1.contains(it)){
                li.add(it);
                set1.remove(it);
            }
        }

        // return li.stream().mapToInt(i -> i).toArray();

        int ans[] = new int[li.size()];
        int i = 0;
        for(int it:li)
            ans[i++] = it;

        return ans;

    }
}