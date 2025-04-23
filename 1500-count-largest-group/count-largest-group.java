class Solution {
    public int countLargestGroup(int n) {
        int hash[] = new int[n+1];
        for(int i=1;i<=n;i++)
        {
            int sum = 0,num=i;
            while(num>0)
            {
                sum += num%10;
                num /= 10;
            }
            hash[sum]++;
        }

        int max = -1,count=1;
        for(int i=1;i<hash.length;i++)
        {
            if(hash[i]>max){
                max = hash[i];
                count = 1;
            }
            else if(hash[i]==max)
                count++;
        }

        return count;
    }
}