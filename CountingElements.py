class Solution:
    def countElements(self, arr: List[int]) -> int:
        d={}
        count=0
        for n in arr:
            if(n not in d.keys()):
                d[n]=1
            else:
                d[n]+=1
        
        for key in d.keys():
            if(int(key)+1 in d.keys()):
                count+=d[key]
        return count
