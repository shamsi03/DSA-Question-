class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>>ans = new ArrayList<>();
        List<Integer>li = new ArrayList<>();

        helper(ans,li,nums);

        return ans;
    }

    void helper(List<List<Integer>>ans , List<Integer>li , int[] nums){

        if(li.size() == nums.length){
            ans.add(new ArrayList<>(li));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(li.contains(nums[i]))
                continue;
            li.add(nums[i]);
            helper(ans,li,nums);
            li.remove(li.size()-1);
        }
    }
}