class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        //Optimal Approach -> apply binary search on the answer space

        //find the max element for deciding the range of my answer space
        int maxElement = -1;
        for(int it : nums)
            maxElement = Math.max(it , maxElement);
        int ans = 0;
        //apply binary search on the answer space (1-maxElement)
        int low = 1 , high = maxElement; //this is my answer space
        while(low <= high)
        {
            int mid = low + (high-low)/2;

            int result = findSum(nums,mid);

            if(result <= threshold)
            {
                ans = mid;
                high = mid-1; //looking for the minimum divisor
            }
            else
                low = mid+1; //looking for the larger divisor
        }

        return ans;
    }

    int findSum(int[] nums , int divisor)
    {
        int sum = 0;
        for(int it:nums)
        {
            double divide = Math.ceil((double) it/divisor);
            sum += (int) divide; //ceil always return in double
        }

        return sum;
    }
}