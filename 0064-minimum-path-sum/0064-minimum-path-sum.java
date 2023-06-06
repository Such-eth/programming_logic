class Solution {
    int[][] dp;
    public int minPathSum(int[][] grid) {
        dp=new int[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                dp[i][j]=-1;
            }
        }
        return mini(grid,0,0);
    }
    public int mini(int[][] arr,int i,int j){
        if(i==arr.length-1 && j==arr[0].length-1)
            return arr[i][j];
        if(i>arr.length-1 || j>arr[0].length-1)
            return Integer.MAX_VALUE;
        if(dp[i][j]>-1)
            return dp[i][j];
        dp[i][j] = arr[i][j]+Math.min(mini(arr,i+1,j),mini(arr,i,j+1));
        return dp[i][j];
    }
}
// if(m<0 || n<0)
//             return Integer.MAX_VALUE;
//         if(m==0 && n==0)
//             return grid[0][0];
        
//         return grid[m][n] + Math.min(find(grid, m-1, n),find(grid, m, n-1)); 