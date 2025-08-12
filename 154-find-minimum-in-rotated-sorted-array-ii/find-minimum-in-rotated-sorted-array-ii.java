class Solution {
    public int findMin(int[] nums) {
        int min_element = Integer.MAX_VALUE;
        for(int it:nums)
            min_element = Math.min(min_element,it);


        return min_element;
    }
}