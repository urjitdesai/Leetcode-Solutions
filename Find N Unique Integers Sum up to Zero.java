class Solution {
    public int[] sumZero(int n) {
        
        int ans[]=new int[n];
        if(n==1)
            return new int[]{0};
        int i=0,val=1;
        if(n%2==0){
            while(i<=n-2){
                ans[i]=val;
                ans[i+1]=-val;
                val++;
                i=i+2;
            }
        }
        else{
            ans[0]=0;
            i=1;
            while(i<=n-2){
                ans[i]=val;
                ans[i+1]=-val;
                val++;
                i=i+2;
            }
        }
        return ans;
    }
}
