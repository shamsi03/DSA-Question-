class Solution {
    public int largestRectangleArea(int[] heights) {
        int minFromLeft[]= new int[heights.length];
        int minFromRight[] = new int[heights.length];

        // finding next minimum for every heights from their left
        Stack<Integer>left = new Stack<>();
        for(int i=0;i<heights.length;i++)
        {
            while(!left.isEmpty() && heights[left.peek()] >= heights[i])
            {
                left.pop();
            }
            if(left.isEmpty())
                minFromLeft[i] = -1;
            else
                minFromLeft[i] = left.peek();

            left.push(i);
        }

        //finding next minimum for every heights from their right
        Stack<Integer>right = new Stack<>();
        for(int i=heights.length-1;i>=0;i--)
        {
            while(!right.isEmpty() && heights[right.peek()] >= heights[i])
            {
                right.pop();
            }
            if(right.isEmpty())
                minFromRight[i] = heights.length;
            else
                minFromRight[i] = right.peek();

            right.push(i);
        }

        //finding the current area width : j-i-1 = minFromRight[i]-minFromLeft[i]-1
        int maxArea = -1;
        for(int i=0;i<heights.length;i++)
        {
            int height = heights[i];
            int width = minFromRight[i] - minFromLeft[i] - 1 ;
            int currArea = height * width;

            maxArea = Math.max(maxArea,currArea);
        }

        return maxArea;


    }
}