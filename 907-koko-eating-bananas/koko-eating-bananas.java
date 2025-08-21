class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        // for finding the maximum value -> for deciding the range of our search space
        int maxPile = Integer.MIN_VALUE;
        for(int it:piles)
            maxPile = Math.max(it,maxPile);
    
        int ans = 0;
        int low = 1, high = maxPile; //answer space -> ispe hi hum BS apply kar rhe hai
        while(low <= high)
        {
            int mid = low + (high-low)/2;

            int reqTime = calculateTotalHours(piles,mid);

            if(reqTime <= h)
            {
                ans = mid;
                high = mid-1;
            }
            else
                low = mid+1;
        }

        return ans;
    }

    int calculateTotalHours(int[] nums , int speed)
    {
        int totalHours = 0;
        for(int it:nums){
           totalHours += Math.ceil((double)it / (double)speed);
        }

        return totalHours;
    }
}