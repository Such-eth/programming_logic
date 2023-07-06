class Solution {
    int[][][] dp;
    public int maxProfit(int[] arr) {
        dp = new int[arr.length+1][2][3];
        int n=arr.length;
        for(int ind=n-1;ind>=0;ind--){
            for(int buy=0;buy<=1;buy++){
                for(int tr=1;tr<=2;tr++){
                    if(buy==1){
                        dp[ind][buy][tr]=Math.max(dp[ind+1][0][tr]-arr[ind],dp[ind+1][1][tr]);
                    }else{
                        dp[ind][buy][tr]=Math.max(dp[ind+1][1][tr-1]+arr[ind],dp[ind+1][0][tr]);
                    }
                }
            }
        } 
        return dp[0][1][2];
    }
}