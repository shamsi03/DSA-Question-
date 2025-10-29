class Solution {
    public int maximumCandies(int[] candies, long k) {
        
        //find sum of all candies and also minimum candies -> for deciding my answer space
        int  maxCandies = -1;
        for(int it:candies)
        {
            maxCandies = Math.max(maxCandies,it);

        }

        int low = 1 , high = maxCandies ; // this is my answer space

        int ans = 0;
        while(low <= high)
        {
            int mid = low + (high-low)/2;
            long pile_size = findPileSize(candies,mid);

            if(pile_size >= k){
                ans = mid;
                low = mid+1;
            }
            else
                high = mid-1;
        }

        return ans;
    }

    long findPileSize(int candies[],int minCandies){
        long pile_size = 0;
        for(int it:candies){
            pile_size += it/minCandies;
        }

        return pile_size;
    }
}