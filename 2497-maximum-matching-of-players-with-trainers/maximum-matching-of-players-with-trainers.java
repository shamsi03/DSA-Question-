class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int start=0,maxMatchingPlyer = 0;

        for(int i=0;i<trainers.length;i++)
        {
            if(start<players.length)
            {
                if(players[start]<=trainers[i])
                {
                    maxMatchingPlyer++;
                    start++;
                }
            }
        }


        return maxMatchingPlyer;
    }
}