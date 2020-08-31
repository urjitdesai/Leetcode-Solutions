class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if(nums.length==0)
            return 0;
        int ans=0, len=0;
        for(int i=1; i<nums.length;i++){
            if(nums[i-1]<nums[i]){
                len+=1;
                ans=Math.max(ans, len);
            }else{
                len=0;
            }
            
        }
        return ans>0 ? ans+1: 1;
    }
}
