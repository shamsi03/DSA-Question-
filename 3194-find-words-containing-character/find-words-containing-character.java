class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer>ans = new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            String check = words[i];
            if(check.contains(x+""))
                ans.add(i);
        }

        return ans;
    }
}