class Solution {
    public int pivotIndex(int[] nums) {
        if(nums.length==0)
            return -1;
        if(nums.length==1)
            return 0;
        int lsum[]= new int[nums.length];
        lsum[0]=nums[0];
        int rsum[]=new int[nums.length];
        rsum[nums.length-1]=nums[nums.length-1];
        for(int i=1,j=nums.length-2;j>=0;i++,j--){
            lsum[i]=lsum[i-1]+nums[i];
            rsum[j]=rsum[j+1]+nums[j];
        }
        for(int i=0;i<nums.length;i++){
            if(lsum[i]==rsum[i])
                return i;
        }
        return -1;
        
    }
}
