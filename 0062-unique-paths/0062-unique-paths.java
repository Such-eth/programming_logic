class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp = new int[m][n];
        for(int i=0;i<n;i++)
            dp[0][i]=1;
        for(int i=0;i<m;i++)
            dp[i][0]=1;
        for(int i=1;i<m;i++){
            for(int j=1;j<n;j++){
                int left = dp[i][j-1];
                int topLeft = dp[i-1][j];
                dp[i][j]=left+topLeft;
            }
        }
        return dp[m-1][n-1];
    }
    // public int find(int i,int j){
    //     if(i==0||j==0) return dp[i][j]=1;
    //     if(dp[i][j]!=0) return dp[i][j];
    //     int left = find(i,j-1);
    //     int topLeft = find(i-1,j);
    //     return dp[i][j]=left+topLeft;
    // }
}
