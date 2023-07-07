class Solution {
    int[][][] dp;
    public int maxProfit(int k, int[] prices) {
        dp = new int[prices.length][2][k+1];
        return maxi(prices,0,1,k);
    }
    public int maxi(int[] arr,int ind,int buy,int k){
        if(ind==arr.length || k==0){
            return 0;
        }
        if(dp[ind][buy][k]>0){
            return dp[ind][buy][k];
        }
        int profit=0;
        if(buy==1){
            profit=Math.max(maxi(arr,ind+1,0,k)-arr[ind],maxi(arr,ind+1,1,k));
        }else{
            profit=Math.max(maxi(arr,ind+1,1,k-1)+arr[ind],maxi(arr,ind+1,0,k));
        }
        return dp[ind][buy][k]=profit;
    }
}