class Solution {
    public int largestAltitude(int[] gain) {
        for(int i=1;i<gain.length;i++)
            gain[i] += gain[i-1];

        //find the maximum altitude
        int max_altitude = 0;
        for(int it:gain)
            max_altitude = Math.max(max_altitude,it);

        return max_altitude;
    }
}