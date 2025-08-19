class Solution {
    public boolean isPerfectSquare(int num) {
        
        //Optimal Approach -> apply binary search on answer space

        int low = 1 , high = num;

        while(low <= high)
        {
            int mid = low + (high-low)/2;

            // long check = mid * mid;

            if(((long) mid*mid) == num) return true;
            else if(((long) mid*mid) < num) 
                low = mid+1;
            else
                high = mid-1;
        }

        return false;
    }
}