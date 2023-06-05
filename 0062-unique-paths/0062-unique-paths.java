class Solution {
    static int count=0;
    static int[][] dp;
    public static int uniquePaths(int m, int n) {
        count=0;
        boolean[][] arr = new boolean[m][n];
        dp=new int[m][n];
        // helper(arr,0,0);
        return helper1(arr,0,0);
    }

    private static void helper(boolean[][] arr, int i, int j) {
        if(i>=arr.length || j>=arr[0].length){return;}
        if(i== arr.length-1 || j==arr[0].length-1){
            count++;
            return;
        }
        //down
        if(i< arr.length-1){
            helper(arr,i+1,j);
        }
        //right
        if(j<arr[0].length-1){
            helper(arr,i,j+1);
        }
    }
    
    private static int helper1(boolean[][] arr, int i, int j){
        if(i>=arr.length || j>=arr[0].length){return 0;}
        if(i== arr.length-1 || j==arr[0].length-1){
            return 1;
        }
        if(dp[i][j]>0){
            return dp[i][j];
        }
        int c=0;
        //down
        if(i< arr.length-1){
            c+=helper1(arr,i+1,j);
        }
        //right
        if(j<arr[0].length-1){
            c+=helper1(arr,i,j+1);
        }
        dp[i][j]=c;
        return c;
    }
}