class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minSize = Integer.MAX_VALUE;
        for(String st : strs)
            minSize = Math.min(minSize,st.length());

        String ans = "";
        for(int i=0;i<minSize;i++)
        {
            for(String st : strs)
            {
                if(strs[0].charAt(i) != st.charAt(i))
                    return ans;
            }

            ans += strs[0].charAt(i);
        }

        return ans;
    }
}