class Solution {
    public int arrangeCoins(int n) {
        
        int countStair = 0;
        for(int i=1;i<=n;i++)
        {
            if(i<=n)
            {
                countStair++;
                n -= i;
            }
        }

        return countStair;
    }
}