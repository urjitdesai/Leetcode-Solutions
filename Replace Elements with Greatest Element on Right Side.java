class Solution {
    public int[] replaceElements(int[] arr) {
        int ans[]=new int[arr.length];
        ans[arr.length-1]=-1;
        int greatest_till_now=arr[arr.length-1];
        //arr[arr.length-1]=-1;
        for(int i=arr.length-2; i>=0;i--){
            if(arr[i+1]>greatest_till_now){
                greatest_till_now=arr[i+1];
            }
            ans[i]=greatest_till_now;
        }
        return ans;
    }
}
