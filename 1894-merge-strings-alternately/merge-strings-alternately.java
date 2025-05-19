class Solution {
    public String mergeAlternately(String word1, String word2) {
        int size1 = word1.length();
        int size2 = word2.length();
        String ans = "";

        int start1=0,start2=0,indexAns=0;
        while(start1<size1 && start2<size2)
        {
            ans += word1.charAt(start1);
            ans += word2.charAt(start2);
            start1++;
            start2++;
        }

        while(start1<size1)
        {
            ans += word1.charAt(start1);
            start1++;
        }

        while(start2<size2)
        {
            ans += word2.charAt(start2);
            start2++;
        }


        return ans;
    }
}