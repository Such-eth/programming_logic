class Solution {
    boolean[][] dp;
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i:nums)
            sum+=i;
        if(sum%2==1)
            return false;
        dp = new boolean[nums.length+1][sum/2+1];
        for(int i=0;i<nums.length+1;i++)
            dp[i][0]=true;
        for(int ind=nums.length-1;ind>=0;ind--){
            for(int s=1;s<=sum/2;s++){
                boolean take=false,notTake=false;
                if(s-nums[ind]>=0)
                  take = dp[ind+1][s-nums[ind]];
                notTake = dp[ind+1][s];
                dp[ind][s]=take || notTake;
            }
        }
        return dp[0][sum/2];
    }
    // public boolean find(int[] arr, int ind,int sum){
    //     if(sum==0)
    //         return true;
    //     if(ind==arr.length || sum<0)
    //         return false;
    //     if(dp[ind][sum])
    //         return dp[ind][sum];
    //     boolean take,notTake;
    //     take = find(arr,ind+1,sum-arr[ind]);
    //     notTake = find(arr,ind+1,sum);
    //     return dp[ind][sum]=take || notTake; 
    // }
}