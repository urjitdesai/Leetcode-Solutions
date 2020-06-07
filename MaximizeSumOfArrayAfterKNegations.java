class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        Arrays.sort(A);
        int sum = 0;
        int i = 0;
        while(A[i] < 0 && K > 0) {
            A[i] = -1 * A[i];
            i++;
            K--;
        }
        Arrays.sort(A);
        if(K % 2 == 1) {
            A[0] = -1 * A[0];
        }
        for(int j = 0; j < A.length; j++) {
            sum += A[j];
        }
        return sum;
    }
}
