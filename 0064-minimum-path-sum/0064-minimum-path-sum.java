class Solution {
    public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
        int sum=0;
        for(int i=grid.length-1;i>=0;i--){
            dp[i][grid[0].length-1]=grid[i][grid[0].length-1]+sum;
            sum=dp[i][grid[0].length-1];
        }
        sum=0;
        for(int i=grid[0].length-1;i>=0;i--){
            dp[grid.length-1][i]=grid[grid.length-1][i]+sum;
            sum=dp[grid.length-1][i];
        }
        for(int row=grid.length-2;row>=0;row--){
            for(int col=grid[0].length-2;col>=0;col--){
                int down=Integer.MAX_VALUE,right=Integer.MAX_VALUE;
                if(row<grid.length-1)
                     down = dp[row+1][col]+grid[row][col];
                if(col<grid[0].length-1)
                    right = dp[row][col+1]+grid[row][col];
                dp[row][col]=Math.min(down,right);
            }
        }
        // for(int[] i:dp){
        //     System.out.println(Arrays.toString(i));
        // }
        return dp[0][0];
        // int x = findPathSum(grid,0,0,dp)
        // return x;
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