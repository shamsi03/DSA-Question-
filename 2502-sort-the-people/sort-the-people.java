class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        String[] hash = new String[100001];
        for(int i =0;i<heights.length;i++)
            hash[heights[i]] = names[i];

        int replaceIndex=0;
        for(int i=hash.length-1;i>=0;i--)
        {
            if(hash[i]!=null)
                names[replaceIndex++] = hash[i];
        }

        return names;
    }
}