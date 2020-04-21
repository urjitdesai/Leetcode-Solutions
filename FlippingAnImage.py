class Solution:
    def flipAndInvertImage(self, A: List[List[int]]) -> List[List[int]]:
        ans=[]
        for row in A:
            new_row=row[::-1]
            add_row=[]
            for element in new_row:
                if(element==0):
                    add_row.append(1)
                else:
                    add_row.append(0)
            ans.append(add_row)
        return ans
                
