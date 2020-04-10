class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        my_dict={}
        for i in range(0,len(nums)):
            if(nums[i] in my_dict.keys()):
                my_dict[nums[i]]+=1
                continue
            else:
                my_dict[nums[i]]=1
        
        for key in my_dict.keys():
            if my_dict[key]==1:
                return key
        return 0
        
