class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int indx1 = g.length-1;
        int indx2 = s.length-1;
        int count = 0;
        while(indx1>=0 && indx2>=0)
        {
            if(s[indx2]>=g[indx1])
            {
                indx1--;
                indx2--;
                count++;
            }
            else
                indx1--;
        }

        return count;
    }
}