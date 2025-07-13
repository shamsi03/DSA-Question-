class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int idxGreed = 0 , idxSize = 0;

        int maxNum = 0;
        while(idxGreed<g.length && idxSize<s.length)
        {
            if(g[idxGreed] <= s[idxSize])
            {
                idxGreed++;
                idxSize++;
                maxNum ++;
            }
            else // yahan pe uski greed ko puri nahi kar pa rha hai isliye uski size increase kar ke same greed k sath check kiya , isliye size array ke index ko badha kar ke check kar rhe hai hum sirf.
                idxSize++;
        }

        return maxNum;
    }
}