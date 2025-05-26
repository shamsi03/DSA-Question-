class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character>st = new Stack<>();
        for(int i=0;i<num.length();i++)
        {
            char ch = num.charAt(i);
            while(!st.isEmpty() && ch<st.peek() &&  k>0)
            {
                st.pop();
                k--;
            }
            st.push(ch);
        }
        while(k>0){
            st.pop();
            k--;
        }

        StringBuilder ans = new StringBuilder();
        for(char ch : st)
            ans.append(ch);

        while(!ans.isEmpty() && ans.charAt(0)=='0')
        {
            ans.deleteCharAt(0);
        }

        return ans.isEmpty()?"0":ans.toString();
    }
}