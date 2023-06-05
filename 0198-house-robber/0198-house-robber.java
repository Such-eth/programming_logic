class Solution {
    int[] dp;
    public int rob(int[] nums) {
        dp = new int[nums.length];
        for(int i=0;i<dp.length;i++){
            dp[i]=-1;
        }
        return helper(nums,0);
    }
    public int helper(int[] arr,int n){
        if(n==arr.length-1)
            return arr[arr.length-1];
        if(n>=arr.length-1)
            return 0;
        if(dp[n]>=0)
            return dp[n];
        dp[n] = Math.max(helper(arr,n+1),arr[n]+helper(arr,n+2));
        return dp[n];
    }
}