class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        // Arrays.fill(dp, -1);
        Arrays.fill(dp, Integer.MAX_VALUE);
        int ans = find1(coins, amount,dp);
        return (ans == Integer.MAX_VALUE) ?  -1 : ans;
    }
    public int find(int[] arr,int amt,int[] dp)
    {
        if(amt==0)
            return dp[amt]=0;
        if(amt<0)
            return Integer.MAX_VALUE;
        if(dp[amt]!=-1)
            return dp[amt];
        int take=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int ans = find(arr,amt-arr[i],dp);
            if(ans!=Integer.MAX_VALUE)
                take = Math.min(take,1+ans);
        }
        return dp[amt]=take;
    }
    public int find1(int[] arr,int amount,int[] dp){
        dp[0] = 0;
        for(int amt=1;amt<dp.length;amt++){
            int take=Integer.MAX_VALUE;
            for(int i=0;i<arr.length;i++){
                if(amt - arr[i] >= 0 && dp[amt - arr[i]] != Integer.MAX_VALUE) {
                    dp[amt] = Math.min(dp[amt], 1 + dp[amt - arr[i]]);
                }
            }
        }
        return dp[amount];
    }
}