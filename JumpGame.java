class Solution {
    public boolean canJump(int[] nums) {
        int lastgoodindex=nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(i+nums[i]>=lastgoodindex){
                lastgoodindex=i;
            }
        }
    return lastgoodindex==0;       
    }
}
