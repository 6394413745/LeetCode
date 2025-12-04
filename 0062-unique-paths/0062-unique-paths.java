class Solution {
    public static int path(int row,int col,int m,int n,int [][] dp){
        if(row >= m || col >= n)return 0;
        if(row >= m-1 && col >= n-1)return 1;
        if(dp[row][col] != -1)return dp[row][col];
        int rightpath = path(row,col+1,m,n,dp);
        int downpath = path(row+1,col,m,n,dp);
        return dp[row][col] = rightpath + downpath;
    }
    public int uniquePaths(int m, int n) {
        int [][] dp = new int [m][n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){//isme Arrays.fill me error de raha tha to loop lga ke kar diya
                dp[i][j] = -1;
            }
            
        }
        return path(0,0,m,n,dp);
    }
}