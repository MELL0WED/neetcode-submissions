class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(res, sub, target, 0, candidates);
        return res;
    }

    void backtrack(List<List<Integer>> res, List<Integer> sub, int target, int start, int nums[]){

        if(target == 0){
            res.add(new ArrayList<>(sub));
            return;
        }
        if(target < 0){
            return;
        }

        for(int i=start; i<nums.length; i++){

            if(i>start && nums[i]==nums[i-1]) continue;

            sub.add(nums[i]);
            backtrack(res, sub, target-nums[i], i+1, nums);
            sub.remove(sub.size()-1);
        }
    }
}
