class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer>st = new Stack<>();
        for(int it:asteroids)
        {
            if(st.isEmpty() || it>0)
                st.push(it);
            else{
                while(!st.isEmpty())
                {
                    if(st.peek()<0){
                        st.push(it);
                        break;
                    }
                    int modVal = Math.abs(it);
                    if(modVal<st.peek()){
                        break;
                    }
                    else if(modVal == st.peek()){
                        st.pop();
                        break;
                    }
                    else{
                        st.pop();
                        if(st.isEmpty())
                        {
                            st.push(it);
                            break;
                        }
                    }

                }
            }
        }

        int ans[] = new int[st.size()];
        int index = 0;
        for(int it:st)
            ans[index++] = it;

        return ans;
    }
}