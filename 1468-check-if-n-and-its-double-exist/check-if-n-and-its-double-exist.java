class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer>m = new HashMap<>();
        for(int i=0;i<arr.length;i++)
            m.put(arr[i],i);
        for(int i=0;i<arr.length;i++)
        {
            if(m.containsKey(2*arr[i]) && m.get(2*arr[i])!=i )  // special condition because of zero 
                return true;
        }

        return false;
    }
}