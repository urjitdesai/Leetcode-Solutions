class Solution:
    def kidsWithCandies(self, candies: List[int], extraCandies: int) -> List[bool]:
        
        ans=[]
        maxi=max(candies)
        for candy in candies:
            if candy+extraCandies>=maxi:
                ans.append(True)
            else:
                ans.append(False)
        return ans
        
