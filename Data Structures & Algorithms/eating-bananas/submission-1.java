class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1, r = 0;
        int res = r;
        
        for(int pile: piles){
            r = Math.max(pile, r);
        }

        while(l<=r){
            int mid = (l+r)/2;

            int totalTime = 0;

            for(int pile: piles){
                totalTime += Math.ceil((double) pile / mid);
            }

            if(totalTime <= h){
                res = mid;
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return res;

    }
}
