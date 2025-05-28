class Solution {
    public int calculate(String s) {
        Stack<Integer>st = new Stack<>();
        int res=0,num=0,sign=1;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='+' || s.charAt(i)=='-')
            {
                res += num*sign;
                num = 0;
                if(s.charAt(i)=='+')
                    sign = 1;
                else if(s.charAt(i)=='-')
                    sign = -1;
            }
            else if(s.charAt(i)=='(')
            {
                st.push(res);
                st.push(sign);
                num = 0;
                res = 0;
                sign = 1;
            }
            else if(s.charAt(i)==')')
            {
                res += num*sign;
                num = 0;
                res = res*st.pop()+st.pop();
                
            }
            else if(s.charAt(i)!=' '){
                num = num*10 + (s.charAt(i)-'0');
            }
        }

        return res+num*sign;
    }
}