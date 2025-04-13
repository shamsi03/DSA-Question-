class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        ArrayList<Integer>ans = new ArrayList<>();
        
        //using selection sort
        for(int i=0;i<nums.length-1;i++)
        {
            int index = i;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[index]>nums[j])
                    index = j;
            }
            //swap of most minimum to i'th value
            int temp = nums[i];
            nums[i] = nums[index];
            nums[index] = temp;
        }

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
                ans.add(i);
        }


        return ans;
    }
}