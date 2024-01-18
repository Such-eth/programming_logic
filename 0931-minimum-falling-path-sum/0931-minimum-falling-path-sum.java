class Solution {
    int[][] dp;
    public int minFallingPathSum(int[][] matrix) {
        dp = new int[matrix.length][matrix[0].length];
        for (int row[] : dp)
            Arrays.fill(row, -1);
        for(int i=0;i<matrix[0].length;i++){
            dp[matrix.length-1][i]=matrix[matrix.length-1][i];
        }
        for(int row=matrix.length-2;row>=0;row--){
            for(int col=matrix[0].length-1;col>=0;col--){
                int left=Integer.MAX_VALUE,down=Integer.MAX_VALUE,right=Integer.MAX_VALUE; 
                if(col>0)
                    left = matrix[row][col]+dp[row+1][col-1];
                else left += (int) Math.pow(-10, 9);
                down = matrix[row][col]+dp[row+1][col];
                if(col<matrix[0].length-1)
                    right = matrix[row][col]+dp[row+1][col+1];
                else right += (int) Math.pow(-10, 9);
                dp[row][col]=Math.min(left,Math.min(down,right));
            }
        }
        int min = Integer.MAX_VALUE;
        for(int i=0;i<matrix[0].length;i++){
            min=Math.min(min,dp[0][i]);
        }
        // for(int[] i:dp)
        //     System.out.println(Arrays.toString(i));
        return min;
    }
    // public int findSum(int[][] arr,int row,int col){
    //     if(row==arr.length-1){
    //         return dp[row][col]=arr[row][col];
    //     }
    //     if(dp[row][col]!=-1)
    //         return dp[row][col];
    //     int left=Integer.MAX_VALUE,down=Integer.MAX_VALUE,right=Integer.MAX_VALUE; 
    //     if(row<arr.length-1){
    //         if(col>0)
    //             left = arr[row][col]+findSum(arr,row+1,col-1);
    //         down = arr[row][col]+findSum(arr,row+1,col);
    //         if(col<arr[0].length-1)
    //             right = arr[row][col]+findSum(arr,row+1,col+1);
    //     }
    //     // System.out.println(left+" "+down+" "+right);
    //     return dp[row][col]=Math.min(left,Math.min(down,right));        
    // }
}