class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        return GCD(nums[0],nums[nums.length-1]);
    }

    int GCD(int num1,int num2){
        if(num2 == 0) return num1;

        return GCD(num2,num1%num2);
    }
}