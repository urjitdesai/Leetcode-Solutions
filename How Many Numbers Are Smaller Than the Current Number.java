class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        HashMap <Integer, Integer> map= new HashMap<>();
        int[] copy=nums.clone();
        Arrays.sort(copy);
        int rank=0;
        for(int i=0;i<copy.length;i++){
            if(!map.containsKey(copy[i])){
                map.put(copy[i], rank);
            }
            rank++;
        }
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            ans[i]=map.get(nums[i]);
        }
        return ans;
    }
}
