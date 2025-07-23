class Solution {
    public int maxVowels(String s, int k) {
        int countVowel = 0;
        for(int i=0;i<k;i++)
        {
            if(isVowel(s.charAt(i)))
                countVowel++;
        }

        System.out.println(countVowel);

        int left=0,right=k-1,maxVowel=countVowel;
        while(right<s.length()-1)
        {
            if(isVowel(s.charAt(left)) && countVowel!=0)
                countVowel--;
            left++;
            right++;
            if(isVowel(s.charAt(right)))
                countVowel++;
            maxVowel = Math.max(maxVowel,countVowel);
           
        }

        return maxVowel;
    }

    boolean isVowel(char ch)
    {
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
            return true;
        else
            return false;
    }
}