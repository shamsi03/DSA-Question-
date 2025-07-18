class Solution {
    public int numberOfSubstrings(String s) {
        int left=0,right=0,currCount=0,countSubStr = 0;
        int freq[] = new int[3];
        while(right<s.length())
        {
            char ch = s.charAt(right);
            freq[ch-'a']++;
            if(freq[ch-'a']==1)
                currCount++;
            while(currCount==3)
            {
                countSubStr += s.length()-right;
                char chL = s.charAt(left);
                freq[chL-'a']--;
                if(freq[chL-'a']==0)
                    currCount--;

                left++;
            }


            right++;
        }

        return countSubStr;
    }
}