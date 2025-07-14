class Solution {
    public int lengthOfLongestSubstring(String s) {
        int hash[] = new int[256];
        for(int i=0;i<256;i++)
            hash[i] = -1;

        int lIndex=0,rIndex=0,maxLength=0;
        while(rIndex<s.length())
        {
            if(hash[s.charAt(rIndex)]!=-1)
            {
                if(hash[s.charAt(rIndex)] >= lIndex)
                    lIndex = hash[s.charAt(rIndex)]+1;
            }

            maxLength = Math.max(maxLength,rIndex-lIndex+1);
            hash[s.charAt(rIndex)] = rIndex;
            rIndex++;
        }

        return maxLength;
    }
}