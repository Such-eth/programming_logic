class Solution {
    int dp[][];
    public int maxProfit(int[] prices) {
        dp = new int[prices.length+1][2];
        dp[prices.length][0]=0;
        dp[prices.length][1]=0;
        int profit=0;
        for(int ind=prices.length-1;ind>=0;ind--){
            for(int buy=0;buy<=1;buy++){
                if(buy==1){
                    profit=Math.max(dp[ind+1][0]-prices[ind],dp[ind+1][1]);
                }else{
                     profit=Math.max(dp[ind+1][1]+prices[ind],dp[ind+1][0]);
                }
                dp[ind][buy] = profit;
            }
        }
        return dp[0][1];
    }
}