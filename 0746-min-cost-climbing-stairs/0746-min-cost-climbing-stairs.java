class Solution {
    public static int minCost(int i, int [] cost,int [] dp){
        if(i==0 || i==1)return cost[i];
        if(dp[i] != -1)return dp[i];

        dp[i] = cost[i] + Math.min(minCost(i-1,cost,dp),minCost(i-2,cost,dp));
        return dp[i];
    }
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);

        return Math.min(minCost(n-1,cost,dp),minCost(n-2,cost,dp));
    }
}