class Solution:
    def createTargetArray(self, nums: List[int], index: List[int]) -> List[int]:
        target=[]
        for x,y in zip(nums,index):
            target.insert(y,x)
        return target
        
