class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int startGreed = 0 , startSize = 0;

        int maxNum = 0;
        while(startGreed<g.length && startSize<s.length)
        {
            if(g[startGreed] <= s[startSize])
            {
                startGreed++;
                startSize++;
                maxNum ++;
            }
            else
                startSize++;
        }

        return maxNum;
    }
}