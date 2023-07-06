class Solution {
    int[][][] dp;
    public int maxProfit(int[] prices) {
        dp = new int[prices.length][2][3];
        for(int[][] i:dp){
            for(int[] j:i){
                Arrays.fill(j,-1);
            }
        }
        return maxi(prices,0,1,2);
    }
    public int maxi(int[] arr,int ind,int buy,int tr){
        if(ind==arr.length || tr==0){
            return 0;
        }
        if(dp[ind][buy][tr]>-1){
            return dp[ind][buy][tr];
        }
        int profit=0;
        if(buy==1){
            profit=Math.max(maxi(arr,ind+1,0,tr)-arr[ind],maxi(arr,ind+1,1,tr));
        }else{
            profit=Math.max(maxi(arr,ind+1,1,tr-1)+arr[ind],maxi(arr,ind+1,0,tr));
        }
        return dp[ind][buy][tr]=profit;
    }
}