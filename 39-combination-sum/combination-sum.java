class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>curr = new ArrayList<>();

        findSum(candidates,target,ans,curr,0,0);

        return ans;
    }

    void findSum(int[] nums,int target,List<List<Integer>>ans,List<Integer>curr,int idx,int sum){

        if(sum == target){
            ans.add(new ArrayList<>(curr));
            return;
        }

        if(sum > target || idx == nums.length)
            return;

        curr.add(nums[idx]);
        sum += nums[idx];
        findSum(nums,target,ans,curr,idx,sum);
        curr.remove(curr.size()-1);
        sum -= nums[idx];
        findSum(nums,target,ans,curr,idx+1,sum);

    }
}