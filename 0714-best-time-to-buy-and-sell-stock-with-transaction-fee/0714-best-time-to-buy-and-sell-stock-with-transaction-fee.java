class Solution {
    public int maxProfit(int[] prices, int fee) {
        int[] dp = new int[prices.length+1];
        dp[prices.length]=0;
        dp[prices.length]=0;
        int profit=0;
        int[] mid = new int[2];
        for(int ind=prices.length-1;ind>=0;ind--){
            for(int buy=0;buy<=1;buy++){
                if(buy==1){
                    profit=Math.max(mid[0]-prices[ind]-fee,mid[1]);
                }else{
                     profit=Math.max(mid[1]+prices[ind],mid[0]);
                }
                mid[buy] = profit;
            }
        }
        return mid[1];
    }
}