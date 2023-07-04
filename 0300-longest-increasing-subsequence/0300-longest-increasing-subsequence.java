class Solution {
    public static int[][] dp;
    public static int lengthOfLIS(int[] nums) {
        dp = new int[nums.length][nums.length];
        for(int[] i:dp)
            Arrays.fill(i,-1);
        return find_size(nums,0,-1);
    }
    private static int find_size(int[] arr, int i, int j) {
        if(i==arr.length){
            return 0;
        }
        if(dp[i][j+1]>-1){
            return dp[i][j+1];
        }
        int exc = find_size(arr,i+1,j);
        int inc=0;
        if(j==-1 || arr[i]>arr[j])
            inc = 1+find_size(arr,i+1,i);
        dp[i][j+1]=Math.max(exc,inc);
        return dp[i][j+1];
    }
}