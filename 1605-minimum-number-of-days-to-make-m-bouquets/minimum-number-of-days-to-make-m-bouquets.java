class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        //Optimal approach -> apply binary search on the search space

        //find the min and max element -> for deciding the answer space
        int minElement = Integer.MAX_VALUE , maxElement = -1;
        for(int it: bloomDay)
        {
            maxElement = Math.max(it,maxElement);
            minElement = Math.min(it,minElement);
        }

        //binary search apply 
        int ans = -1;
        int low = minElement , high = maxElement; //this is my answer space 
        while(low <= high)
        {
            int mid = low + (high-low)/2;

            int totalBouquets = findPossibleBouquets(bloomDay,mid,k);

            if(totalBouquets >= m)
            {
                ans = mid;
                high = mid-1; // for looking the minimum 
            }
            else
                low = mid + 1; //looking for the maximum
        }

        return ans;
    }


    int findPossibleBouquets(int[] bloomDay,int day,int k)
    {
        int countAdjacent = 0 , totalBouquets = 0;
        for(int it:bloomDay)
        {
            //adjacent flower count , if flower bloom on that day
            if(it <= day)
                countAdjacent++; 
            else{ // flower not blooom.
                totalBouquets += (countAdjacent/k); //kitne bouquets bana skte h.
                countAdjacent = 0;
            }
        }
        //last me ek baar phir se find kar liya kitne bouquets ban skte hai
        totalBouquets += (countAdjacent/k);  

        return totalBouquets;
    }
}