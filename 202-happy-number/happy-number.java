class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer>set = new HashSet<>();
        while(n!=1 && !set.contains(n))
        {
            set.add(n);
            n = findSum(n);
        }


        return n==1;
    }

    int findSum(int num)
    {
        int sum = 0;
        while(num > 0)
        {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }

        return sum;
    }
}