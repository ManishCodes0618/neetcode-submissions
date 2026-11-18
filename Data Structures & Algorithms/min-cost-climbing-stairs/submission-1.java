class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n= cost.length;
        int[] dp= new int[n+1];
        Arrays.fill(dp,-1);
        dp[0]=0;
        dp[1]=0;
        dp[2]=Math.min(cost[0],cost[1]);
        recur(n,n,dp,cost);
        // for(int i: dp){
        //     System.out.print(i+" ");
        // }
        return dp[n];
    }
    public static int recur(int i, int n, int[] dp, int[] cost){
        if(i<3){
            return dp[i];
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int first= recur(i-1,n,dp,cost)+cost[i-1];
        int sec= recur(i-2,n,dp,cost)+cost[i-2];
        dp[i]=Math.min(first,sec);
        return dp[i];
    }
}
