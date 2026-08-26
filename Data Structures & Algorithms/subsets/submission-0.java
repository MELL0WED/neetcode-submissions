class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> subset = new ArrayList<>();
        int n = nums.length;
        backTrack(res, subset, 0, nums);

        return res;
    }

    private void backTrack(List<List<Integer>> res, List<Integer> sub, int start, int nums[]){
        res.add(new ArrayList<>(sub));

        for(int i=start; i<nums.length; i++){
            sub.add(nums[i]);

            backTrack(res, sub, i+1, nums);

            sub.remove(sub.size()-1);
        }
    }
}

