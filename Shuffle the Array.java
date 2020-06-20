class Solution {
    public int[] shuffle(int[] nums, int n) {
        int ans[]=new int[nums.length];
        int k=0;
        for(int i=0,j=n;i<n;i++,j++){
            ans[k]=nums[i];
            ans[k+1]=nums[j];
            k=k+2;
        }
        return ans;
    }
}
