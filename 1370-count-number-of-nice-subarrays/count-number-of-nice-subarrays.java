class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        
        //first calculate less than k 
        int lessK = countSubArray(nums,k);

        //find less than k-1
        int lessK_1 = countSubArray(nums,k-1);

        //final (less than k - less than k-1)

        return (lessK - lessK_1);
    }

    int countSubArray(int[] nums , int k)
    {
        int left = 0, right = 0, countSub = 0, sum = 0;

        while(right<nums.length)
        {
            sum  = sum + (nums[right]%2);

            while(sum > k)
            {
                sum = sum - (nums[left]%2);
                left++;
            }

            if(sum<=k)
                countSub = countSub + (right - left + 1);
            
            right++;
        }


        return countSub;
    }
}