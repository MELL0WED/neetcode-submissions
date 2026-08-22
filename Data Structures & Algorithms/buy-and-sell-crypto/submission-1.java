class Solution {
    public int maxProfit(int[] prices) {
        int maxProf = 0;
        int minVal = prices[0];
        
        for(int i=1;i<prices.length;i++){
            minVal = Math.min(minVal, prices[i]);
            maxProf = Math.max(maxProf, prices[i] - minVal);
        }
        return maxProf;
    }
}
