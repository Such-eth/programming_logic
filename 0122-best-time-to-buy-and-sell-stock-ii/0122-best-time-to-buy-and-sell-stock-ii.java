class Solution {
    int dp[][];
    public int maxProfit(int[] prices) {
        dp = new int[prices.length][2];
        for(int[] i:dp){
            Arrays.fill(i,-1);
        }
        return maxi(prices,0,1);
    }
    public int maxi(int[] arr,int ind,int buy){
        if(ind==arr.length){
            return 0;
        }
        if(dp[ind][buy]>-1){
            return dp[ind][buy];
        }
        int profit=0;
        if(buy==1){
            profit=Math.max(maxi(arr,ind+1,0)-arr[ind],maxi(arr,ind+1,1));
        }else{
            profit=Math.max(maxi(arr,ind+1,1)+arr[ind],maxi(arr,ind+1,0));
        }
        return dp[ind][buy] = profit;
    }
}