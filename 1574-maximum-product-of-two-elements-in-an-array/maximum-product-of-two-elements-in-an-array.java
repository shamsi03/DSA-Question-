class Solution {
    public int maxProduct(int[] nums) {
        int firstMax = 0;
        int secondMax = 0;

        for(int it:nums){
            if(it > firstMax){
                secondMax = firstMax;
                firstMax = it;
            }
            else if(it > secondMax && secondMax != firstMax){
                secondMax = it;
            }
        }
        
        return (firstMax-1)*(secondMax-1);

    }
}