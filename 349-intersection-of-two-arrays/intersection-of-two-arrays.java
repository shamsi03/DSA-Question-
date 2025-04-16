class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>m1 = new HashMap<>();
        HashMap<Integer,Integer>m2 = new HashMap<>();
        ArrayList<Integer>li = new ArrayList<>();
        for(int it:nums1)
            m1.put(it,m1.getOrDefault(it,0)+1);
        for(int it:nums2)
            m2.put(it,m2.getOrDefault(it,0)+1);

        for(int it:m2.keySet())
        {
            int target = it;
            if(m1.containsKey(target))
                li.add(target);
        }

        int ans[] = li.stream().mapToInt(i -> i).toArray();

        return ans;
    }
}