class Solution {
    public String reversePrefix(String word, char ch) {
        if(!word.contains(ch+"")) return word;
        Stack<Character>st = new Stack<>();
        String ans = "";
        for(int i=0;i<word.length();i++)
        {
            char copy = word.charAt(i);
            if(ch==copy)
            {
                st.push(copy);
                while(!st.isEmpty()){
                    ans += st.peek();
                    st.pop();
                }
                i++;
                while(i<word.length()){
                    ans += word.charAt(i);
                    i++;
                }
                return ans;
            }

            st.push(copy);

        }

        return ans;
    }
}