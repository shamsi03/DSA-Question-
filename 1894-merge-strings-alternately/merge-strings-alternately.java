class Solution {
    public String mergeAlternately(String word1, String word2) {
        int size1 = word1.length(),size2 = word2.length();
        String ans = "";
        for(int i=0;i<size1 && i<size2;i++)
        {
            ans += word1.charAt(i);
            ans += word2.charAt(i);
        }

        if(size1>size2)
        {
            for(int i=size2;i<size1;i++)
                ans += word1.charAt(i);
        }
        else{
            for(int i=size1;i<size2;i++)
                ans += word2.charAt(i);
        }


        return ans;
    }
}