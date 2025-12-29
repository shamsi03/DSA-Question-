class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int normalKadane = kadaneAlgo(nums);

        int totalSum = 0;
        for(int i=0;i<nums.length;i++){
            totalSum += nums[i];
            nums[i] *= -1;
        }

        int negativeKadane = kadaneAlgo(nums);
        if(totalSum+negativeKadane == 0) return normalKadane;

        return Math.max(normalKadane,totalSum+negativeKadane);
        
    }
    int kadaneAlgo(int[] arr){
        int currSum = 0 , maxSum = Integer.MIN_VALUE;
        for(int it:arr)
        {
            if(currSum<0)
                currSum = 0;

            currSum += it;
            maxSum = Math.max(maxSum,currSum);
        }
        System.out.println(maxSum + " ");
        return maxSum;
    }
}