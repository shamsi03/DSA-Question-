class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer>li = new ArrayList<>();
        Arrays.sort(nums1);
        int target=-1;
        HashMap<Integer,Integer>m = new HashMap<>();
        for(int it:nums2)
            m.put(it,m.getOrDefault(it,0)+1);

        for(int it:m.keySet())
        {
            target = it;
            int start=0,end=nums1.length-1;
            while(start<=end)
            {
                int mid = end - (end-start)/2;

                if(nums1[mid] == target)
                {
                    li.add(target);
                    break;
                }
                else if(nums1[mid]>target) 
                    end = mid-1;
                else
                    start = mid+1;
            }
        }

        int[] ans = li.stream().mapToInt(i -> i).toArray();

        return ans;
    }
}