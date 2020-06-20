class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        
        e1=max(nums)
        nums.remove(e1)
        e2=max(nums)
        return (e1-1)*(e2-1)
        
