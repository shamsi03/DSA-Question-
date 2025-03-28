class Solution {
    public int thirdMax(int[] nums) {
        long firstMax=Long.MIN_VALUE,secondMax=Long.MIN_VALUE,thirdMax=Long.MIN_VALUE;
        int count = 0;
        for(int it : nums)
        {
            if(firstMax < it)
            {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = it;
            }
            else if(secondMax < it && it<firstMax)
            {
                thirdMax = secondMax;
                secondMax = it;
            }
            else if(thirdMax < it && it<secondMax){
                thirdMax = it;
                count=1;
            }
        }

        if(thirdMax==Long.MIN_VALUE )
            return (int)firstMax;
        else
            return (int)thirdMax;
    }
}