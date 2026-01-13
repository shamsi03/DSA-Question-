class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer>li = new ArrayList<>();

        printSubset(ans,li,nums,0);

        return ans;
    }

    void printSubset(List<List<Integer>>ans , List<Integer>li,int[] nums,int i){

        if(i==nums.length){
            ans.add(new ArrayList<>(li));
            return;
        }

        li.add(nums[i]);
        printSubset(ans,li,nums,i+1);
        li.remove(li.size()-1);
        printSubset(ans,li,nums,i+1);
    }

}