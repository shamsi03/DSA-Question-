class Solution {
    public boolean hasSameDigits(String s) {
        while(s.length() > 2 ){
            String ans = "";
            char first = s.charAt(0);
            char second = s.charAt(1);
            int idx = 2;
            while(idx<s.length()){
                ans += (((first-'0') + (second-'0'))%10);
                first = second;
                second = s.charAt(idx++);
            }
            ans += (((first-'0') + (second-'0'))%10);
            s = ans;
        }
        return s.charAt(0) == s.charAt(1);
    }
}