class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int finalSum = 0;
        for(int it:arr)
            finalSum += it;

        int firstSum = 0;
        for(int i=0;i<arr.length-2;i++){
            firstSum += arr[i];
            int secondSum = 0;
            for(int j=i+1;j<arr.length-1;j++){
                secondSum += arr[j];
                int thirdSum = finalSum - (firstSum + secondSum);

                if(firstSum == secondSum && secondSum == thirdSum)
                    return true;
            }
        }

        return false;
    }
}