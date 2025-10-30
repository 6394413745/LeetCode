class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int maxSum = 0;
        for(int i = 0;i<m;i++){
            int rowSum = 0;
            for(int j = 0;j<n;j++){
                rowSum += accounts[i][j];
            }
            if(rowSum > maxSum){
            maxSum = rowSum;
        }
        }
        
        return maxSum;
    }
}