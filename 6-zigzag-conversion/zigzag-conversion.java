class Solution {
    public String convert(String s, int numRows) {
        String arr[] = new String[numRows];
        for(int i=0;i<arr.length;i++)
            arr[i] = "";
        int i=0;
        while(i<s.length())
        {
            for(int start=0;start<numRows && i<s.length();start++)
                arr[start] += s.charAt(i++);
            for(int end=numRows-2;end>0 && i<s.length();end--)
                arr[end] += s.charAt(i++);
        }
        String ans = "";
        for(String st:arr)
            ans += st;

        return ans;
    }
}