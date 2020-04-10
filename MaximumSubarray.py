class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        max_global=nums[0]
        max_current=nums[0]
        
        for num in nums[1:]:
            max_current=max(num,max_current+num)
            if(max_current>max_global):
                max_global=max_current
        return max_global
            
        
