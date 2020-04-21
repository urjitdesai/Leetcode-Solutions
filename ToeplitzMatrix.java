class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        boolean ans=false;
        
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int r=i,c=j;
                while(r<matrix.length && c<matrix[0].length){
                    if(matrix[i][j]==matrix[r++][c++])
                        ans=true;
                    else
                        ans=false;
                    if(ans==false)
                        return false;
                }
            }
        }
        return true;
        
    }
}
