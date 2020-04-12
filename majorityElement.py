class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        my_dict={}
        l=len(nums)
        for n in nums:
            if(n not in my_dict.keys()):
                my_dict[n]=1
            else:
                my_dict[n]+=1
                
        for key in my_dict.keys():
            if(my_dict[key]>(l/2)):
                return key
        
        
