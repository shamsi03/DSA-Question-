class Solution {
    public int shipWithinDays(int[] weights, int days) {
         //find the sum of all elements and max-element also -> for deciding my answer space
        int sum = 0 , maxElement=-1;
        for(int it:weights){
            sum += it;
            maxElement = Math.max(it,maxElement);
        }

        int ans = 0;
        int low = maxElement , high = sum; //this is my answer space -> now apply BS on this
        while(low <= high)
        {
            int mid = low + (high-low)/2;

            int totalDays = countDays(weights,mid);

            if(totalDays <= days)
            {
                ans = mid;
                high = mid - 1; 
            }
            else
                low = mid+1;
        }

        return ans;
    }

    int countDays(int[] nums,int capacity)
    {
        int countDay = 1, sum = 0;
        for(int it:nums)
        {
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