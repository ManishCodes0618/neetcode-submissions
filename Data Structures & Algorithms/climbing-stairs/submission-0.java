class Solution {
    public int climbStairs(int n) {
        if(n<3){
            return n;
        }
        int[] dp = new int[n+1];
        dp[1]=1;
        dp[2]=2;
        recur(n,n,dp);
        return dp[n];
    }
    public static int recur(int i,int n, int[] dp){
        if(i<3){
            return dp[i];
        }
        if(dp[i]!=0){
            return dp[i];
        }
        dp[i]= recur(i-1,n,dp)+recur(i-2,n,dp);
        return dp[i];
    }
}
