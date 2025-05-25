class Solution {
    public int[] finalPrices(int[] prices) {
        int minRight[] = new int[prices.length];
        Stack<Integer>st = new Stack<>();
        for(int i=prices.length-1;i>=0;i--)
        {
            while(!st.isEmpty() && st.peek() > prices[i])
            {
                st.pop();
            }
            if(st.isEmpty()) minRight[i] = 0;
            else minRight[i] = st.peek();

            st.push(prices[i]);
        } 
        for(int i=0;i<prices.length;i++)
        {
            minRight[i] = prices[i] - minRight[i];
        }

        return minRight;

    }
}