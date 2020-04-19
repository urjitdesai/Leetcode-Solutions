class Solution {
    public int[] sortedSquares(int[] A) {
        int []ans=new int[A.length];
        int left=0;
        int right=A.length-1;
        int k=A.length-1;
        while(left<=right && k>=0){
            if(A[left]*A[left]<A[right]*A[right]){
                ans[k]=A[right]*A[right];
                k--;
                right--;
            }
            else{
                ans[k]=A[left]*A[left];
                k--;
                left++;
            }
                
        }
        return ans;
    }
}
