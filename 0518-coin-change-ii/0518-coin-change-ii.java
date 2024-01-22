class Solution {
    int[][] dp;
    public int change(int amount, int[] coins) {
        // Arrays.sort(coins);
        dp = new int[coins.length][amount+1];
        // for(int[] i:dp)
        //     Arrays.fill(i,-1);
        for(int i=0;i<amount+1;i++){
            if(i%coins[0]==0)
                dp[0][i]=1;
            else dp[0][i]=0;
        }
        for(int ind=1;ind<coins.length;ind++){
            for(int amt=0;amt<=amount;amt++){
                int notTake = dp[ind-1][amt];
                int take=0;
                if(coins[ind]<=amt)
                    take = dp[ind][amt-coins[ind]];
                dp[ind][amt]=take+notTake;
            }
        }
        return dp[coins.length-1][amount];
    }
    // public int find(int[] arr,int ind,int amt){
    //     if(ind==0){
    //         if(amt%arr[ind]==0)
    //             return dp[ind][amt]=1;
    //         return dp[ind][amt]=0;
    //     }
    //     if(dp[ind][amt]!=-1)
    //         return dp[ind][amt];
    //     int notTake = find(arr,ind-1,amt);
    //     int take=0;
    //     if(arr[ind]<=amt)
    //         take = find(arr,ind,amt-arr[ind]);
    //     return dp[ind][amt]=take+notTake;
    // }
}