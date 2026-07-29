class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumOdd = n*n;
        int sumEven = n*(n+1);

        return findGCD(sumOdd,sumEven);
    }

    int findGCD(int first, int second){
        if(second == 0)
            return first;

        return findGCD(second,first%second);
    }
}