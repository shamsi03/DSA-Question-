class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        
        int n =  nums.length;

        int lastProduct = nums[n-1]*nums[n-2]*nums[n-3];

        //negative value ke case me 
        int firstProduct = nums[0]*nums[1]*nums[n-1];

        return Math.max(firstProduct,lastProduct);
    }
}