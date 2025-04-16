class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer>m = new HashMap<>();
        ArrayList<Integer>li= new ArrayList<>();
        for(int it:nums1)
            m.put(it,m.getOrDefault(it,0)+1);

        for(int i=0;i<nums2.length;i++)
        {
            if((m.containsKey(nums2[i])) && (m.get(nums2[i])>0))
            {
                li.add(nums2[i]);
                m.put(nums2[i],m.get(nums2[i])-1);
            }
        }

        int ans[] = li.stream().mapToInt(i -> i).toArray();

        return ans;
    }
}