class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        return findPathSum(grid,0,0,dp);
    }
    public int findPathSum(int[][] arr,int row,int col,int[][] dp){
        // if(row>=arr.length || col>=arr[0].length){
        //     return Integer.MAX_VALUE;
        // }
        if(dp[row][col]!=0)
            return dp[row][col];
        if(row==arr.length-1 && col==arr[0].length-1)
            return dp[row][col]=arr[row][col];
        int down=Integer.MAX_VALUE,right=Integer.MAX_VALUE;
        if(row<arr.length-1)
             down = findPathSum(arr,row+1,col,dp)+arr[row][col];
        if(col<arr[0].length-1)
            right = findPathSum(arr,row,col+1,dp)+arr[row][col];
        return dp[row][col]=Math.min(down,right);
    }
}