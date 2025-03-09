class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer>m = new HashMap<>();
        int countZero = 0;
        for(int i=0;i<arr.length;i++){
            m.put(arr[i],i);
            if(arr[i] == 0) countZero++;
        }

        if(countZero > 1) return true; //because 0 ko double karne pe 0 tb hi milega jb ek se jyada element 0 ho
        for(int i=0;i<arr.length;i++)
        {
            if(m.containsKey(2*arr[i]) && arr[i]!=0 )  // special condition because of zero 
                return true;
        }

        return false;   
    }
}