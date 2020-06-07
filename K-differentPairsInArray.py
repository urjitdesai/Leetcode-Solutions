class Solution:
    def findPairs(self, nums: List[int], k: int) -> int:
        nums=sorted(nums)
        s=set()
        i=0
        j=i+1
        
        while(i < len(nums) and  j< len(nums)):
            if(nums[j]-nums[i]==k):
                s.add((nums[i],nums[j]))
                i=i+1
                j=i+1
            elif(nums[j]-nums[i]>k):
                i=i+1
                j=i+1
            else:
                j=j+1
        
        return len(s)
                
                
            
            
        
