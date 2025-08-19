class Solution {
    public int mySqrt(int x) {
        
        //Brute force approach

        int ans = 0;
        for(long i=1;i<=x;i++)
        {
            if(i*i <= x)
            {
                ans = (int) i;
            }
            else
                break;
        }

        return ans;
    }
}