class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
    
        Map<Integer,Integer>m1 = new HashMap<>();
        for(int i=0;i<nums1.length;i++)
            m1.put(nums1[i],m1.getOrDefault(nums1[i],0)+1);

        HashMap<Integer,Integer>m2 = new HashMap<>();
        for(int i=0;i<nums2.length;i++)
            m2.put(nums2[i],m2.getOrDefault(nums2[i],0)+1);

        // for cheking the answer[0]
        int countStore1=0;
        for(int it:m1.keySet())
        {
            if(m2.containsKey(it))
                countStore1 += m1.get(it);
        }


        //for checking the ans[1];
        int countStore2 = 0;
        for(int it:m2.keySet())
        {
            if(m1.containsKey(it))
                countStore2 += m2.get(it);
        }


        return new int[]{countStore1,countStore2};
    }
}