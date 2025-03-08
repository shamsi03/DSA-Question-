class Solution {
    public int findMaxK(int[] nums) {
        int hash[] = new int[1001];
        Arrays.fill(hash,Integer.MAX_VALUE);
        int ans = -1;
        for(int it:nums)
        {
            if(it<0)
                hash[-it] = hash[-it]==1?hash[-it]-1:-1;
            else
                hash[it] = hash[it]==-1?hash[it]+1:1;

            if(hash[Math.abs(it)] == 0)
                ans = Math.max(ans,Math.abs(it));
        }

        return ans;
    }
}