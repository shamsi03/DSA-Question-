class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer>m = new HashMap<>();
        int sum = 0;
        m.put(0,-1);
        for(int i=0;i<nums.length;i++)
        {
            sum +=nums[i];
            int mod = sum % k;
            // if(mod==0 && i>0)
            //     return true;
            if(m.containsKey(mod))
            {
                int findIndex = m.get(mod);
                if(i-findIndex >=2)
                    return true;
            }
            else
            m.put(mod,i);
        }

        return false;
    }
}