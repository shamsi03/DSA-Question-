class Solution {
    public int trap(int[] height) {
        
        //find the leftMax of each element ->left side me us element ka maximum support kya hai 
        int leftMax[] = new int[height.length];
        for(int i=1;i<height.length;i++)
            leftMax[i] = Math.max(leftMax[i-1],height[i-1]);
        
        //finding the rightMax of each element -> uske right side me uska maximum support kya  hai 
        int rightMax[] = new int[height.length];
        for(int i=height.length-2;i>=0;i--)
            rightMax[i] = Math.max(rightMax[i+1],height[i+1]);

        //finding the actual trap water
        int trapWater = 0;
        for(int i=0;i<height.length;i++)
        {
            int minSupport = Math.min(leftMax[i],rightMax[i]);
            if(minSupport-height[i]>0)
                trapWater += minSupport-height[i];
        }

        return trapWater;
    }
}