class Solution:
    def isValid(self, s: str) -> bool:
        braces=list(s)
        check=[]
        for bracket in braces:
            if(bracket in ("(","[","{")):
                check.append(bracket)
            if(bracket in (")","}","]")):
                if(len(check)==0):
                    return False
                x=check.pop()
                if((x=="(" and bracket!=")") or (x=="[" and bracket!="]") or (x=="{" and bracket!="}")):
                   return False
        if (len(check)==0):
            return True
        else:
                   return False
