class Solution {
    public int characterReplacement(String s, int k) {
        int hash[] = new int[26];
        int left=0,right=0,maxFreq=0,maxLen=0;
        while(right<s.length())
        {
            char ch = s.charAt(right);
            hash[ch-'A']++;
            maxFreq = Math.max(maxFreq,hash[ch-'A']);

            while((right-left+1)-maxFreq > k)
            {
                char ch1 = s.charAt(left);
                hash[ch1-'A']--;
                maxFreq = 0;
                for(int it:hash)
                    maxFreq = Math.max(maxFreq,it);

                left++;
            }

            if((right-left+1)-maxFreq <= k)
                maxLen = Math.max(maxLen,right-left+1);

            right++;
        }

        return maxLen;
    }
}