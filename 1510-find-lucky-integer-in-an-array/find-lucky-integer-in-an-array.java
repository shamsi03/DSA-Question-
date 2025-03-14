class Solution {
    public int findLucky(int[] arr) {
        int size = -1;
        for(int it:arr)
        {
            if(size<it)
                size = it;
        }

        //create hash table
        int hash[] = new int[size+1];

        //iterate the hash table
        for(int it:arr)
            hash[it]++;
        

        int luckyNum = -1;
        for(int i=1;i<hash.length;i++)
        {
            if(hash[i] == i)
                luckyNum = Math.max(luckyNum,i);
        }

        return luckyNum;
    }
}