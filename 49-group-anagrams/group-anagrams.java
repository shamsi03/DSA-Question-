class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String,List<String>>map = new HashMap<>();
        for(String word : strs)
        {
            //sort the word -> sorted key chahiye
            char ch[] = word.toCharArray();
            Arrays.sort(ch);
            String sortedWord = new String(ch);

            //Value add karo -> list me us sorted key ke according
            
            //agar exists nahi kar rhi hai key to us key ke sath ek new list ko add karo 
            if(!map.containsKey(sortedWord))
                map.put(sortedWord,new ArrayList<>());

            //list me value add karo
            map.get(sortedWord).add(word);
        }


        return new ArrayList<>(map.values());
    }
}