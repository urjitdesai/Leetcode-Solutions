class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int cnt = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] a : dominoes) {
            int max = Math.max(a[0], a[1]), min = Math.min(a[0], a[1]);
            int key = min * 10 + max;
            int pairs = map.getOrDefault(key, 0); // the number of dominoes already in the map is the number of the newly found pairs.
            cnt += pairs;
            map.put(key, 1 + pairs);
                               
        }
        return cnt;
    }
}
