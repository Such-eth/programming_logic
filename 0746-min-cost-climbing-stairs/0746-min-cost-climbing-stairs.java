class Solution {
    int[] dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp,-1);
        return Math.min(mini(cost,0),mini(cost,1));
    }
    public int mini(int[] arr,int i){
        if(i==arr.length-1){
            return arr[i];
        }
        if(i>arr.length-1)
            return 0;
        if(dp[i]>-1)
            return dp[i];
        return dp[i]=arr[i]+Math.min(mini(arr,i+1),mini(arr,i+2));
    }
}