class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int odd_index=1, even_index=0;
        int ans[]=new int[A.length];
        
        for(int i=0;i<A.length;i++){
            if(A[i]%2==0){
                ans[even_index]=A[i];
                even_index+=2;
            }
            else{
                ans[odd_index]=A[i];
                odd_index+=2;
            }
        }
        return ans;
    }
}
