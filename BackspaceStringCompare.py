class Solution(object):
    def backspaceCompare(self, S, T):
        """
        :type S: str
        :type T: str
        :rtype: bool
        """
        s=list(S)
        t=list(T)
        
        s1=[]
        s2=[]
        
        for ch in s:
            if(ch=="#" and len(s1)==0):
                continue
            if(ch=="#" and len(s1)!=0):
                s1.pop()
            else:
                s1.append(ch)
        
        for ch in t:
            if(ch=="#" and len(s2)==0):
                continue
            if(ch=="#" and len(s2)!=0):
                s2.pop()
            else:
                s2.append(ch)
        
        if(len(s1)!=len(s2)):
            return False
        for (x,y) in zip(s1,s2):
            if(x!=y):
                return False
        return True
