class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        boolean used[] = new boolean[nums.length];

        backtrack(res, sub, used, nums);
        return res;
    }

    void backtrack(List<List<Integer>> res, List<Integer> sub, boolean used[],  int nums[]){

        if(nums.length == sub.size()){
            res.add(new ArrayList<>(sub));
            return;
        }

        for(int i=0;i<nums.length;i++){
                if(used[i]) continue;
                sub.add(nums[i]);
                used[i] = true;
                backtrack(res, sub, used, nums);
                used[i] = false;
                sub.remove(sub.size()-1);
            
        }

    }
}
