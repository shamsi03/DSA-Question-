class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0,end=numbers.length-1;
        int ans[] = {0,0};
        while(start<=end)
        {
            if(numbers[start]+numbers[end] == target)
            {
                ans[0] = start+1; //becuase 1-based indexing
                ans[1] = end+1;
                break;
            }
            else if(numbers[start]+numbers[end] > target)
                end--;
            else
                start++;
        }

        return ans;
    }
}