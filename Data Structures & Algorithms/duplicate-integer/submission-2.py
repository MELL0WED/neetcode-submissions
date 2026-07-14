class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        map1=[]
        for num in nums:
            if num not in map1:
                map1.append(num)
            else:
                return True
        return False