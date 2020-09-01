class Solution:
    def arrayRankTransform(self, arr: List[int]) -> List[int]:
        elements= sorted(list(set(arr)))
        hashmap={}
        rank=1
        for i in elements:
            hashmap[i]=rank
            rank=rank+1
        answer=[]
        for i in arr:
            answer.append(hashmap[i])
        return answer
