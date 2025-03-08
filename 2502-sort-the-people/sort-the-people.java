class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String>m = new TreeMap<>(Collections.reverseOrder());
        for(int i=0;i<heights.length;i++)
            m.put(heights[i],names[i]);

        int replaceIndex = 0;
        for(int it:m.keySet())
            names[replaceIndex++] = m.get(it);


        return names;
    }
}