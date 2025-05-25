class Solution {
    public String simplifyPath(String path) {
        String canonical[] = path.split("/");
        Stack<String>st = new Stack<>();
        for(String s : canonical)
        {
            if(s.equals("..") && !st.isEmpty())
                st.pop();
            else if(!s.equals(".") && !s.equals("") && !s.equals(".."))
                st.push(s);
        } 

        String ans = "";
        for(String s : st)
        {
            ans += "/";
            ans += s;
        }

        return st.isEmpty()?"/":ans;
    }
}