class Solution {
    public int largestRectangleArea(int[] heights) {
        int minFromLeft[]= new int[heights.length];
        int minFromRight[] = new int[heights.length];

        // finding next minimum for every heights from their left
        Stack<Integer>st = new Stack<>();
        for(int i=0;i<heights.length;i++)
        {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i])
            {
                st.pop();
            }
            if(st.isEmpty())
                minFromLeft[i] = -1;
            else
                minFromLeft[i] = st.peek();

            st.push(i);
        }

        //finding next minimum for every heights from their right
        st = new Stack<>();
        for(int i=heights.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i])
            {
                st.pop();
            }
            if(st.isEmpty())
                minFromRight[i] = heights.length;
            else
                minFromRight[i] = st.peek();

            st.push(i);
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