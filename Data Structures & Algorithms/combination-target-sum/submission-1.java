class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();

        backtrack(res, sub, target, 0, nums);
        return res;
    }

    void backtrack(List<List<Integer>> res, List<Integer> sub, int target, int start, int nums[]){

        if(target == 0){
            res.add(new ArrayList<>(sub));
            return;
        }
        if(target<0){
            return;
        }

        for(int i=start; i<nums.length; i++){
            sub.add(nums[i]);
            backtrack(res, sub, target-nums[i], i, nums);
            sub.remove(sub.size()-1);
        }
    }
}
