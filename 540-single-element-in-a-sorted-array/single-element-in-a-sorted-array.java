class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        // Brute force approach
        int size = nums.length;
        if(size==1) return nums[0];

        for(int i=0;i<size;i++)
        {
            if(i==0){//no need to be check the left part -> out of bound 
                if(nums[i]!=nums[i+1]) return nums[i];
            }
            else if(i==size-1){//no need to be check the left part->OutOfBond 
                if(nums[i-1]!=nums[i]) return nums[i];
            }
            else{
                if(nums[i-1]!=nums[i] && nums[i]!=nums[i+1])
                    return nums[i];
            }
        }

        return -1;
    }
}