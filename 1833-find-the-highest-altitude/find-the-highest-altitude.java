class Solution {
    public int largestAltitude(int[] gain) {
        int max = Math.max(0,gain[0]);

        for(int i=1;i<gain.length;i++)
        {
            gain[i] += gain[i-1]; 
            max = Math.max(max,gain[i]);
        }

        
        // for(int it:gain)
            

        return max;
    }
}