class Solution:
    def convertToTitle(self, n: int) -> str:
        res = ""
        while n:
            n -= 1
            n, mod = divmod(n, 26)
            res = chr(mod+ord('A')) + res
        return res
        
