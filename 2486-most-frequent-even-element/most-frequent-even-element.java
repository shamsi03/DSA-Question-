class Solution {
    public int mostFrequentEven(int[] nums) {
        int hash[] = new int[100001];
        for(int it:nums)
            hash[it]++;

        int max=-1,maxFreq=0;
        for(int i=0;i<hash.length;i+=2)
        {
            if(hash[i]>maxFreq){
                max = i;
                maxFreq = hash[i];
            }
        }

        return max;
    }
}