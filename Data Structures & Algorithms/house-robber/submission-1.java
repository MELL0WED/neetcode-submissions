class Solution {
    public int rob(int[] nums) {
        int num1 = 0, num2 = 0;
        for(int num: nums){
            int temp = Math.max(num2, num1+num);
            num1 = num2;
            num2 = temp;
        }
        return num2;
    }
}
