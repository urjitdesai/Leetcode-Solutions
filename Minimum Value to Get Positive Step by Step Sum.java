class Solution {
    public int minStartValue(int[] nums) {
      
        int sum=0;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];            
            min = Math.min(min,sum);
        }
        
        if(min>0)    //for input [1,2] the minValue will be positive so in that case simply return the startValue as 1.(as specified in the question)
            return 1;
        
        return min*(-1) + 1;              //startvalue =   min*(-1) + 1
    }
}
