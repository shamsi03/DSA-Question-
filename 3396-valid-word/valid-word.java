class Solution {
    public boolean isValid(String word) {
        if(word.length()<3)
            return false;

        int vowel = 0, conson = 0;
        for(int i=0;i<word.length();i++)
        {
            char ch = word.charAt(i);
            if(Character.isLetter(ch)){
                if("aeiou".indexOf(ch)!=-1 || "AEIOU".indexOf(ch)!=-1)
                    vowel++;
                else
                    conson++;
            }
            else if(!Character.isDigit(ch))
                return false;
        }

        if(vowel==0 || conson==0) return false;

        return true;
    }
}