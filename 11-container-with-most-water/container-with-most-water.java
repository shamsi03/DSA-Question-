class Solution {
    public int maxArea(int[] height) {
        
        int maxArea = 0,start=0,end=height.length-1;
        while(start<end)
        {
            int heightY = Math.min(height[start],height[end]);
            int widthX = end-start;

            maxArea = Math.max(maxArea,heightY*widthX);

            if(height[start]<height[end])
                start++;
            else
                end--;
        }

        return maxArea;
    }
}