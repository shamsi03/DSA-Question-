class Solution {
    public String smallestSubsequence(String s) {
        char arr[] = s.toCharArray();
    
        HashMap<Character,Integer>map = new HashMap<>();
        for(char ch : arr)
            map.put(ch,map.getOrDefault(ch,0)+1);
        
        Stack<Character>st = new Stack<>();
        HashSet<Character>set = new HashSet<>();

        for(int i=0;i<s.length();i++)
        {
            char currentChar = s.charAt(i);

            map.put(currentChar,map.getOrDefault(currentChar,0)-1);

            if(set.contains(currentChar)) continue;
            
            while(!st.isEmpty() && currentChar<st.peek() && map.get(st.peek())>0){
                set.remove(st.peek());
                st.pop();            
            }

            if(!set.contains(currentChar))
            {
                st.push(currentChar);
                set.add(currentChar);
            }
        }

        String ans = "";
        for(char ch : st)
            ans += ch;

        return ans;
    }
}