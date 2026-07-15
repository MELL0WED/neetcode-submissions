class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        map1={}
        for i, num in enumerate(nums):
            diff = target - num
            if(diff in map1):
                return [map1[diff], i]
            
            map1[num] = i
        return []
        