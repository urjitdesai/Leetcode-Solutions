class Solution:
    def findLucky(self, arr: List[int]) -> int:
        d={}
        for x in arr:
            if(x not in d.keys()):
                d[x]=1
            else:
                d[x]+=1
        largest=-1
        for key in d.keys():
            if(key==d[key]):
                if(key>largest):
                    largest=key
                
        return largest
        
