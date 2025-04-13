class Solution {

    public boolean isPossible(int day,int[] nums,int m , int k)
    {
        int adj = 0, makeBouq = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=day)
            {
                adj++;
                if(adj == k)
                {
                    makeBouq++;
                    adj = 0;
                }
            }
            else
                adj = 0;
        }

        return makeBouq>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        int max = -1;
        for(int it:bloomDay)
            max = Math.max(max,it);

        int start=0,end=max,ans=-1;
        while(start<=end)
        {
            int mid = end - (end-start)/2;

            if(isPossible(mid,bloomDay,m,k))
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