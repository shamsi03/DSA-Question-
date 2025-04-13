class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
       int copy[] = new int[bloomDay.length];
       for(int i=0;i<bloomDay.length;i++)
            copy[i] = bloomDay[i];
       //for finding the maximum value
        int max = -1;
        for(int it:bloomDay)
            max = Math.max(max,it);

        int start = 0 , end = max,ans=-1;
        while(start<=end)
        {
            int mid = end - (end-start)/2;
            for(int i=0;i<bloomDay.length;i++)
            {
                if(bloomDay[i]<=mid)
                    copy[i] = 0; //flower blow
                else
                    copy[i] = -1; // flower not blow
            }

            //count the total flower that can be blow
            int count = 0;
            int a=0;
            for(int it:copy)
            {
                if(it == 0){
                    count++;
                    if(count>=k) {a++;count=0;}
                    }
                else 
                    count = 0;
            
            }

            if(a>=m)
            {
                ans = mid;
                end = mid-1;
            }
            else
                start = mid+1;
        }


        return ans;
        
    }
}