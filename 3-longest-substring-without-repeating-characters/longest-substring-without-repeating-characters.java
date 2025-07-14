class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int maxLength = 0;
        for(int i=0;i<s.length();i++)
        {
            int hash[] = new int[256];
            for(int j=i;j<s.length();j++)
            {
                if(hash[s.charAt(j)]==1)
                    break;

                maxLength = Math.max(maxLength,j-i+1);
                hash[s.charAt(j)] = 1;
            }
        }

        return maxLength;
    }

}