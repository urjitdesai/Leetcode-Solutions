class Solution:
    def searchInsert(self, nums: List[int], target: int) -> int:
        i=0
        while(i<len(nums)):
            if(nums[i]==target):
                return i
            else:
                if(target<nums[i]):
                    return i
            i+=1
        return i
