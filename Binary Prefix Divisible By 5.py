class Solution:
    def prefixesDivBy5(self, A: List[int]) -> List[bool]:
        
        ans=[]
        cs=""
        for ele in A:
            cs=cs+str(ele)
            if(int(cs,2)%5==0):
                ans.append(True)
            else:
                ans.append(False)
        
        return ans
        
