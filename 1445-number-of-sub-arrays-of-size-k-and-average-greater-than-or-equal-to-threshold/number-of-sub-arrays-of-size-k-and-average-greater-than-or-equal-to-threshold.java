class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int avg = 0,totalSub = 0,sum=0;
        for(int i=0;i<k;i++)
            sum += arr[i];
        avg = sum/k;

        int left=0,right=k-1;
        while(right<arr.length){
            if(avg>=threshold)
                totalSub++;

            sum -= arr[left++];
            right++;
            if(right>=arr.length) break;
            sum += arr[right];
            avg = sum/k;
        }

        return totalSub;
    }
}