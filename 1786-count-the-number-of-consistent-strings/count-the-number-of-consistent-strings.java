class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int ans = 0;
        for(int i=0;i<words.length;i++)
        {
            Map<Character,Integer>m = new HashMap<>();
            for(int j=0;j<words[i].length();j++)
                m.put(words[i].charAt(j),m.getOrDefault(words[i].charAt(j),0)+1);
            

            Map<Character,Integer>m1 = new HashMap<>();
            for(int k=0;k<allowed.length();k++)
                m1.put(allowed.charAt(k),m1.getOrDefault(allowed.charAt(k),0)+1);
            
            int check = 1;
            for(char ch:m.keySet())
            {
                if(!m1.containsKey(ch))
                {
                    check = 0;
                    break;
                }
            }

            if(check == 1)
                ans++;
        }

        return ans;
    }
}