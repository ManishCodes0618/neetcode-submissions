class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        int[] dp= new int[n];
        Arrays.fill(dp,-1);
        dp[0]=nums[0];
        if(n==1){
            return nums[0];
        }
        dp[1]=Math.max(nums[0],nums[1]);
        recur(n-1,n,nums,dp);
        // for(int i: dp){
        //     System.out.print(i+" ");
        // }
        return dp[n-1];
    }
    public static int recur(int i,int n, int[] nums,int[] dp){
        if(i<2){
            return dp[i];
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int left= recur(i-1,n,nums,dp);
        int secLeft= recur(i-2,n,nums,dp) + nums[i];
        dp[i]= Math.max(left,secLeft);
        return dp[i];
    }
}
