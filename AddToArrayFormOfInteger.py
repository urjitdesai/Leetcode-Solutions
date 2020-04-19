class Solution:
    def addToArrayForm(self, A: List[int], K: int) -> List[int]:
        s=""
        for x in A:
            s+=str(x)
        num=int(s)
        num+=K
        num=str(num)
        
        return list(num)
        
