class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int countUnplaced = 0;
        for(int i=0;i<fruits.length;i++)
        {
            boolean check = false;
            for(int j=0;j<baskets.length;j++)
            {
                if(fruits[i]<=baskets[j])
                {
                    baskets[j] = -1;
                    check = true;
                    break;
                }
            }

            if(check == false)
                countUnplaced++;
        }

        return countUnplaced;
    }
}