class Solution {
    public int maxArea(int[] heights) {
        
        int l = 0 , r = heights.length -1;

        int minHeight=0, maxVol=0;

        while(l<r){
            minHeight = Math.min(heights[l], heights[r]);
            maxVol = Math.max(maxVol, minHeight*(r-l));
            if(heights[l]>heights[r]){
                r--;
            }
            else{
                l++;
            }
        }

        return maxVol;

    }
}
