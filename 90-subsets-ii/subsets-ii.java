class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>curr = new ArrayList<>();

        Arrays.sort(nums);
        backtrack(nums,ans,curr,0);

        return ans;
    }

    void backtrack(int[] nums, List<List<Integer>>ans, List<Integer>curr, int idx){

        if(idx == nums.length)
        {
            if(!ans.contains(curr))
                ans.add(new ArrayList<>(curr));

            return;
        }

        curr.add(nums[idx]);
        backtrack(nums,ans,curr,idx+1);

        
        curr.remove(curr.size()-1);
        backtrack(nums,ans,curr,idx+1);
    }
}