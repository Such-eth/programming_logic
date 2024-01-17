class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0;i<m;i++){
            dp[i][n-1]=1;
        }
        for(int i=0;i<n;i++){
            dp[m-1][i]=1;
        }
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){
                int down = dp[i+1][j];
                int right = dp[i][j+1];
                dp[i][j]=down+right;
            }
        }
        return dp[0][0];
    }
    public int findPaths(int row,int col,int m, int n,int[][] dp){
        if(row>=m || col>=n)
            return 0;
        if(dp[row][col]!=0)
            return dp[row][col];
        if(row==m-1 && col==n-1)
            return 1;
        int down = findPaths(row+1,col,m,n,dp);
        int right = findPaths(row,col+1,m,n,dp);
        return dp[row][col]=down+right;
    }
}