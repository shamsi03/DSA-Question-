class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        Arrays.sort(players);
        Arrays.sort(trainers);

        int idxPlayer=0, idxTrainer=0 , maxMatchingPlyer = 0;

        while(idxPlayer<players.length && idxTrainer<trainers.length)
        {
            if(players[idxPlayer] <= trainers[idxTrainer]){
                idxPlayer++;
                idxTrainer++;
                maxMatchingPlyer++;
            }
            else
                idxTrainer++;
        }

        return maxMatchingPlyer;
    }
}