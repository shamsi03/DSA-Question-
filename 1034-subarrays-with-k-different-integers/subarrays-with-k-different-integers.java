class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        
        int lessThanK = findGoodSubArray(nums,k);
        int lessThanK_1 = findGoodSubArray(nums,k-1);


        int totalGoodSub = lessThanK - lessThanK_1;

        return totalGoodSub;
    }

    int findGoodSubArray(int[] nums , int k)
    {
        int countSub = 0,left=0,right=0;
        HashMap<Integer,Integer>map = new HashMap<>();
        while(right<nums.length)
        {
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(map.size() > k)
            {
                map.put(nums[left],map.get(nums[left])-1);

                if(map.get(nums[left]) == 0)
                    map.remove(nums[left]);

                left++;
            }

            if(map.size() <= k)
                countSub = countSub + (right-left+1);

            right++;
        }


        return countSub;
    }
}