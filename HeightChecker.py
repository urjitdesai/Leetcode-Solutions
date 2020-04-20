class Solution:
    def heightChecker(self, heights: List[int]) -> int:
        count=0
        og=list(heights)
        heights.sort()
        
        for x,y in zip (og,heights):
            if(x!=y):
                count+=1
        return count
        
