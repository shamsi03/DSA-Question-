class Solution {
    public int calculate(String s) {
        Stack<Integer>st = new Stack<>();
        int res=0,num=0,sign=1;
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);

            if(ch=='+' || ch=='-')
            {
                res += num*sign;
                num = 0;
                // if(s.charAt(i)=='+')
                //     sign = 1;
                // else if(s.charAt(i)=='-')
                //     sign = -1;

                sign = ch=='+'?1:-1;
            }
            else if(ch=='(')
            {
                st.push(res);
                st.push(sign);
                num = 0;
                res = 0;
                sign = 1;
            }
            else if(ch==')')
            {
                //q ki bracket k last element k baad sign milega hi nahi isliye isko jaise hi close milega uske baad meko us number ko result me store karna parega .
                res += num*sign;
                num = 0;
                res = res*st.pop()+st.pop();
                
            }
            else if(ch!=' '){
                num = num*10 + (ch-'0');
            }
        }

        res += num*sign;
        return res;
    }
}