class Solution {
    void reverse(int[] arr,int start,int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public boolean check(int[] nums) {
        int countK = 1,start=0;
        while(start<nums.length-1)
        {
            if(nums[start]>nums[start+1])
                break;
            countK++;
            start++;
        }

        reverse(nums,0,countK-1);
        reverse(nums,countK,nums.length-1);
        reverse(nums,0,nums.length-1);

        start = 0;
        while(start<nums.length-1)
        {
            if(nums[start]>nums[start+1])
                return false;

            start++;
        }


        return true;
    }
}