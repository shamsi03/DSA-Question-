class Solution {
    public int shipWithinDays(int[] weights, int days) {
        
        //find the sum of all elements -> for deciding my answer space
        int sum = 0;
        for(int it:weights)
            sum += it;

        int ans = 0;
        int low = 1 , high = sum; //this is my answer space -> now apply BS on this
        while(low <= high)
        {
            int mid = low + (high-low)/2;

            int totalDays = countDays(weights,mid);

            if(totalDays!=-1 && totalDays <= days)
            {
                ans = mid;
                high = mid - 1; 
            }
            else
                low = mid+1;
        }

        return ans;
    }

    int countDays(int[] nums, int capacity)
    {
        int sum = 0 , countDay = 1;
        for(int it:nums)
        {
            if(it > capacity) return -1;

            sum += it;
            if(sum > capacity)
            {
                countDay++;
                sum = it;
            }
        }

        return countDay;
    }
}