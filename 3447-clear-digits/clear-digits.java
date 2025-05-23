class Solution {
    public String clearDigits(String s) {
        Stack<Character>st = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch = s.charAt(i);
            if(ch>=48 && ch<=57 && !st.isEmpty())
                st.pop();
            else
                st.push(ch);
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty())
        {
            ans.append(st.peek());
            st.pop();
        }

        return ans.reverse().toString();
    }
}