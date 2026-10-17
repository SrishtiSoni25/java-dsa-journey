class Solution:
    def findDuplicates(self, nums: list[int]) -> list[int]:
        seen=set()
        res=[]
        for num in nums:
            if num in seen:
                 res.append(num)
            else:
                seen.add(num)
        return res
