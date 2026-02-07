class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int [][] ans = new int[m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                ans[i][j] = matrix[i][j];

            }
        }
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(ans[i][j] == 0){
                    for(int b = 0;b<n;b++){
                        matrix[i][b] = 0;
                    }
                    for(int a = 0;a<m;a++){
                        matrix[a][j] = 0;
                    }
                }
            }
        }
    }
}