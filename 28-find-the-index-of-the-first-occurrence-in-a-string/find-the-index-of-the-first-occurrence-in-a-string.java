class Solution {
    public int strStr(String haystack, String needle) {
        
        int lenHay = haystack.length() , needLen = needle.length();

        if(lenHay < needLen) return -1;

        for(int i=0;i<=lenHay-needLen;i++)
        {
            int j = 0;
            while(j<needLen && haystack.charAt(i+j) == needle.charAt(j)) j++;

            if(j == needLen) return i;
        }

        return -1;
    }
}