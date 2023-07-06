class Solution {
    int[][] dp;
    public int maxProfit(int[] arr) {
        int[][] dp = new int[arr.length+2][2];
        int n=arr.length;
        dp[n+1][0] = 0;
        dp[n+1][1] = 0;
        dp[n][0] = 0;
        dp[n][1] = 0;
        int profit=0;
        for(int ind=n-1;ind>=0;ind--){
            for(int buy=0;buy<=1;buy++){
                if(buy==1){
                    profit=Math.max(dp[ind+1][0]-arr[ind],dp[ind+1][1]);
                }else{
                    profit=Math.max(dp[ind+2][1]+arr[ind],dp[ind+1][0]);
                }
                dp[ind][buy]=profit;
            }
        }
        return dp[0][1];
    }
}