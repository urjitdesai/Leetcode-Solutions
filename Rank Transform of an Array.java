class Solution {
    public int[] arrayRankTransform(int[] arr) {
        
        int ans[]=new int[arr.length];
        int dup[]=arr.clone();
        HashMap<Integer, Integer> map=new HashMap<>();
        
        Arrays.sort(arr);
        int rank=1;
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],rank);
                rank+=1;
            }
        }
        
        for(int i=0;i<dup.length;i++){
            ans[i]=map.get(dup[i]);
        }
        return ans;
    }
}
