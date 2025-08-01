class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
         HashMap<Integer,Integer>map = new HashMap<>();
        int left = 0 ,right = 0 , maxLength = 0;

        while(right<nums.length)
        {
            map.put(nums[right],map.getOrDefault(nums[right],0)+1);

            while(map.get(nums[right]) > k)
            {
                map.put(nums[left],map.get(nums[left])-1);

                if(map.get(nums[left]) == 0)
                    map.remove(nums[left]);

                left++;
            }

            if(map.get(nums[right]) <= k)
                maxLength = Math.max(maxLength,right-left+1);

            right++;
        }

        return maxLength;
    }
}