class Solution {
    public boolean isPerfectSquare(int num) {
        
        boolean ans = false;
        for(long i=1;i<=num;i++)
        {
            if(i*i == num)
                ans = true;
            else if(i*i > num)
                break;
        }

        return ans;
    }
}