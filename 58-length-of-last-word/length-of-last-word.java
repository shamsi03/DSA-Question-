class Solution {
    public int lengthOfLastWord(String s) {
        int size = s.length()-1;
        int count = 0;
        for(int i=size;i>=0;i--)
        {
            if(s.charAt(i)== ' ' && count!=0)
                return count;
            else if(s.charAt(i) != ' ')
                count++;
        }

        return count;
    }
}