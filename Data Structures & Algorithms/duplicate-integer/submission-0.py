class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        list=[]
        for i in nums:
            if i not in list:
                list.append(i)
            else:
                return True
        return False
        