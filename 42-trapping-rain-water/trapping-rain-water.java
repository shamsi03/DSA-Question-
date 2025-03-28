class Solution {
    public int trap(int[] height) {
        int size = height.length;
        int leftSupport[] = new int[size];
        int rightSupport[] = new int[size];

        int leftMax=0,rightMax=0;
        for(int i=0;i<size;i++){
            leftSupport[i] = leftMax;
            if(leftMax < height[i])
                leftMax = height[i];
        }

        for(int i=size-1;i>=0;i--){
            rightSupport[i] = rightMax;
            if(rightMax < height[i])
                rightMax = height[i];
        }

        int trapWater = 0,minSupport=0;
        for(int i=0;i<size;i++)
        {
            minSupport = Math.min(leftSupport[i],rightSupport[i]);

            if(minSupport-height[i] > 0 )
                trapWater += minSupport-height[i];
        }


        return trapWater;
    }
}