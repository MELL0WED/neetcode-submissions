class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        max_cnt=0
        cnt=0
        for i in nums:
        
            if i==1:
                cnt+=1
            else:
                if(cnt>max_cnt):
                    max_cnt=cnt
                    cnt=0
                else:
                    cnt=0
        if cnt > max_cnt:
            max_cnt = cnt
        return max_cnt