class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int buy = 0;
        for(int i=1;i<prices.length;i++){
            int profit = prices[i]-prices[buy];
            if(profit>0){
                max+=profit;
            }
            buy=i;
        }
        return max;
    }
}