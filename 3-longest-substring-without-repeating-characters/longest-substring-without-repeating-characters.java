class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character>set = new HashSet<>();
        int left=0,right=0,maxLength=0;
        while(right<s.length())
        {
            char ch = s.charAt(right);
            if(set.add(ch)){
                maxLength = Math.max(maxLength,right-left+1);
                right++;
            }
            else{
                while(s.charAt(left)!=ch)
                {
                    set.remove(s.charAt(left++));
                }
                set.remove(s.charAt(left++));
            }  
        }

        return maxLength;
    }
}