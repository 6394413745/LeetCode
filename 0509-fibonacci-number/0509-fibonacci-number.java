class Solution {
    
    public int fibo(int n,int [] dp){
        if(n<=1)return n;
        if(dp[n] != 0) return dp[n];//agr dp me nth element 0 nhi hai matlab value padi huyi hai to wahi return kar denge
        int ans = fibo(n-1,dp) + fibo(n-2,dp);//agr nhi hai to call lga denge
        dp[n] = ans;//aur call lagane ke baad  wo value dp arr me add kar denge
        return ans;
    }
    public int fib(int n) {
       int [] dp = new int[n+1];//initialise the size with n+1
       return fibo(n,dp);
    }
}